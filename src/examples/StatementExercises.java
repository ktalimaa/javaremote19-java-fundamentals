package examples;

public class StatementExercises {

    public static void main(String[] args) {
        int i;
        //Odd or even exercise
        // solution 1 - using if-else
        for (i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even number");
            } else {
                System.out.println("This is odd number");
            }
        }

        // solution 2 - using ternary operator
        for (i = 0; i <= 20; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + "number"); // i is even/odd number
        }


        // Leap year
        int year = 2022;

        // solution 1
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        // solution 2
        System.out.println(year + " is" + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : " not ") + "a leap year");

        //solution 3 - simple check
        if (year % 4 == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("not leap year");
        }

        //The FIzzBuzz problem
        //Solution 1

        int j = 15;

        if (j % 3 == 0 && j % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (j % 5 == 0) {
            System.out.println("BUZZ");
        } else if (j % 3 == 0) {
            System.out.println("FIZZ");
        }

        //Solution 2
        // Homework 3: one line solution to FizzBuzz


        // IF exercise
        //Write a Java program to find if the person is adult (min age is 18).
        int myAge = 26;
        if (myAge >= 18) {
            System.out.println("The person is adult.");
        }

        //IF-ELSE (always use with two conditions/expressions, or)
        //Write a Java program to print if the given number is odd or even.
        int number = 2020;
        if (number % 2 == 0) {
            System.out.println("This is even number.");
        } else {
            System.out.println("This is odd number");
        }

        //IF, ELSE-IF, ELSE
        //Write a Java program to print if the string is empty, if the string length is greater than 20 and if the string is null.
        String test = "";

        if (test == "") {
            System.out.println("The given string is empty.");
        } else if (test.length() > 20) {
            System.out.println("The given string is so long.");
        } else if (test.length() < 20) {
            System.out.println("The given string is too short.");
        } else if (test == null) {
            System.out.println("The string can not be null.");
        }


        //SWITCH
        //Write a Java program to match the given alphabet.
        char test2 = 'A';

        switch (test2) {
            case 'A':
                System.out.println("The given alphabet is A.");
                break;
            case 'B':
                System.out.println("The given alphabet is B.");
                break;
            case 'K':
                System.out.println("The given alphabet is K.");
            default:
                System.out.println("The given alphabet is not found.");
        }


        //Exercise
        //Write a Java program to print all the odd numbers from 1 to 50 (use if inside the for).
        //  / System.out.println(t + " ");


        //New Example
        for (int r = 1; r <= 50; r++) {
            if (r % 2 != 0) {
                System.out.print(r + " ");
            }
        }

    }
}








