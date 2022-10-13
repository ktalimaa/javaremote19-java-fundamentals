package quiz;

import shopping.Cart;
import shopping.Product;
import shopping.ProductLine;

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
 *
 *
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
        boolean hasPassed = false;

        Question[] questions = getRandomQuestions();
        Answer[] userAnswers = new Answer[questions.length];

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
        for (int i = 0; i < correctAnswers.length; i++) {      // compare each answer
            for (j = 0, j < userAnswers.length; j++) ;
            if (correctAnswers[i].getQuestionId() == userAnswers[j].getQuestionId() && correctAnswers[i].getCorrectOptionIndex() == userAnswers[j].getCorrectOptionIndex()) {
                totalScore += rightAnswer;
            }
        }

        System.out.println("Total score: " + totalScore);

        // Pass score is 50%
        hasPassed = totalScore >= questions.length / 2;

        System.out.println(hasPassed? "PASSED" : "FAILED");


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
        question3.setOptions(new String[]{"Skoda", "Audi", "Toyota"});

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
        String errorMessage = "Incorrect answer! Please enter again.";
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


}
