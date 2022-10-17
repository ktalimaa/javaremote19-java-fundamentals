package quiz;

import shopping.Cart;
import shopping.Product;
import shopping.ProductLine;

import javax.swing.text.html.Option;
import java.util.Scanner;

/**
 * To create a quiz and give the final score
 * <p>
 * Quiz should be minimum of five questions.
 * For each right answer = 1 point.
 * For each negative answer = 0 points.
 * Finally, you have to display the correct answer for each question and the total score.
 * Display the result, PASS OR FAIL? If the user gets more than 3 points, it is passed, less than three points, user has failed.
 * <p>
 * Quiz example:
 * Display question to user like this:
 * a. What is the capitalcity of Estonia?
 * 1. Tallinn
 * 2. Tartu
 * 3. Pärnu
 * 4. Viljandi
 * Enter your answer: user presses 2, false and then goes on
 * When there is invalid answer, there should be "Invalid answer, please enter the given option only." // get menu option from shopping
 * <p>
 * b. next question... min five
 * Total score: sum
 * The correct answers:
 * a. Tallin
 * b. ... and so on
 * <p>
 * <p>
 * Homework:
 * 1. Display the correct answers for the questions
 * 2. Calculate total score
 *
 * @author Kristel Talimaa
 */

// Storing the questions to an array
// Answers in separate array
// String [] questions = {"What is the capital city of Estonia? \n1. Tallinn \n2. Tartu \n3. Pärnu \4. Viljandi"};

public class Quiz {
    public static void main(String[] args) {

        System.out.println("WELCOME TO THE QUIZ");
        System.out.println("--------------------");

        int totalScore = 0;
        int rightAnswer = 1;

        int wrongAnswer = 0;
        int maxPoints = 3;

        boolean hasPassed;

        Question[] questions = getRandomQuestions();
        Answer[] userAnswers = new Answer[questions.length];

        // Display questions and options
        for (int j = 0; j < questions.length; j++) {
            Question question = questions[j];
            System.out.println(question.getDescription());

            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println(i + ". " + question.getOptions()[i]);
            }

            System.out.println("Choose an option from above:");

            // Creating a user answer object and assign it to the userAnswer array
            Answer answer = new Answer();
            answer.setQuestionId(question.getId());
            answer.setCorrectOptionIndex(getAnswerOption(question.getOptions().length));
            userAnswers[j] = answer;
        }

        Answer[] correctAnswers = getAnswers();

        // Total score calculation: Compare answerOptions of CorrectAnswers ant the userAnswer
        for (Answer correctAnswer : correctAnswers) {
            for (Answer userAnswer : userAnswers) {
                if (correctAnswer.getQuestionId() == userAnswer.getQuestionId() && correctAnswer.getCorrectOptionIndex() == userAnswer.getCorrectOptionIndex()) {
                    totalScore += rightAnswer;
                }
            }
        }

        System.out.println("Total score: " + totalScore);

        // Pass score is 50%
        hasPassed = totalScore >= questions.length / 2;

        System.out.println(hasPassed ? "PASSED!" : "FAILED!");
    }


    private static Question[] getRandomQuestions() {
        Question question1 = new Question();
        question1.setId(10000L);
        question1.setDescription("What is the capital of Estonia?");
        question1.setOptions(new String[]{"Tallinn", "Tartu", "Pärnu"});

        Question question2 = new Question();
        question2.setId(100001L);
        question2.setDescription("How many wonders of the world?");
        question2.setOptions(new String[]{"3", "8", "7"});

        Question question3 = new Question();
        question3.setDescription("What is favorite car in Estonia?");
        question3.setId(100002L);
        question3.setOptions(new String[]{"Skoda", "Audi", "BMW"});

        return new Question[]{question1, question2, question3};
    }

    private static Answer[] getAnswers() {
        Answer answer1 = new Answer();
        answer1.setId(20000L);
        answer1.setQuestionId(10000L);          // linking first question to its answer
        answer1.setCorrectOptionIndex(0);       // 0 = correct option in array

        Answer answer2 = new Answer();
        answer2.setId(20001L);
        answer2.setQuestionId(100001L);
        answer2.setCorrectOptionIndex(2);       // 2 = correct option in array

        Answer answer3 = new Answer();
        answer3.setId(20002L);
        answer3.setQuestionId(100002L);
        answer3.setCorrectOptionIndex(1);

        return new Answer[]{answer1, answer2, answer3};

    }

    private static int getAnswerOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect answer! Please enter again:";
        int option = limit + 1;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt();     // correct input

                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);

        return option;
    }

    private static int displayQuizMenu() {
        System.out.println("QUIZ MENU \n---------------");
        System.out.println("1. Show correct answers \n2. Show result \n3. Exit");
        System.out.println("Choose an option form above:");

        return getAnswerOption(3);
    }

    private static Question quizMenu(Question question) {
        Scanner scanner = new Scanner(System.in);
        int quizMenuOption = displayQuizMenu();

        switch (quizMenuOption) {
            case 1:     // display the answers
                int counter = 1;

                if (question != null) {
                    for (Answer answer : question.getOptions()) {
                        if (answer != null) {
                            System.out.println(counter + ". " + answer.() + answer.getCorrectOptionIndex());
                        }
                        counter++;
                    }

                    System.out.println("Total score: " + getAnswerOption());
                    System.out.println("Do you want to go to back to the quiz menu?");
                    String errorMessage = "Incorrect answer! Please enter again:";
                    boolean checker = false;
                    boolean answer = false;

                    do {
                        if (!scanner.hasNextBoolean()) {
                            System.out.println(errorMessage);
                            scanner.next();
                        } else {
                            answer = scanner.nextBoolean();
                            checker = true;
                        }
                    } while (!checker);

                    if (answer) {
                        quizMenu(question);
                    } else {
                        boolean hasPassed = hasPassedTheTest();

                        if (hasPassed) {
                            question = new Question();
                            quizMenu(question);
                        } else {
                            quizMenu(question);
                        }
                    }
                } else {
                    System.out.println("Test is not done!");
                    System.out.println("Going back to quiz menu...");
                    quizMenu(null);
                }
                break;

            case 2:
                if (question.getTotalScore() <= 0) {
                    System.out.println("Test failed! Going back to Quiz menu...");
                    quizMenu(question);
                } else {
                    boolean hasPassed = hasPassedTheTest();

                    if (hasPassed) {
                        question = new Question();
                        quizMenu(question);
                    } else {
                        quizMenu(question);
                    }
                }
                break;

            case 3:
                quizMenu(question);
                break;
        }
        return question;
    }

    private static ProductLine getProductToCart() {
        System.out.println("QUIZ MENU \n-------------------");

        // To get random products to display
        Product[] products = getRandomProducts();

        // Displaying the products
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ". " + products[i].getName());
        }

        System.out.println(products.length + ". " + "Exit to main menu");

        // To get option for product
        System.out.println("Choose an option from above:");
        int productChoice = getMenuOption(products.length);

        if (productChoice == products.length) {
            return null;            // no product has chosen
        } else {
            System.out.println("Enter quantity:");
            Scanner scanner = new Scanner(System.in);
            float quantity = 0;
            String errorMessage = "Incorrect quantity! Please enter again:";

            do {
                if (!scanner.hasNextFloat()) {
                    System.out.println(errorMessage);
                    scanner.next();
                } else {
                    quantity = scanner.nextFloat();

                    if (quantity <= 0) {
                        System.out.println(errorMessage);
                    }
                }
            } while (quantity <= 0);


            // Price calculation
            float price = products[productChoice].getPrice() * quantity;

            // Creating product line for cart
            ProductLine productLine = new ProductLine();
            productLine.setProduct(products[productChoice]);
            productLine.setQuantity(quantity);
            productLine.setPrice(price);

            return productLine;
        }
    }

    private static boolean hasPassedTheTest() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect answer! Please enter again:";
        System.out.println("Do you want to take the test again?");
        boolean checker = false;
        boolean answer = false;

        do {
            if (!scanner.hasNextBoolean()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                answer = scanner.nextBoolean();
                checker = true;
            }
        } while (!checker);

        if (answer) {
            System.out.println("Test passed! Going back to Quiz menu...");
            return true;
        } else {
            System.out.println("Test failed! Going back to Quiz menu...");
            return false;
        }
    }

}
