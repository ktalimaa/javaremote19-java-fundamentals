package basics;

import java.util.Scanner;

/**
 * To read two numbers from the user, add and print the result.
 *
 * @author Kristel Talimaa
 */

public class InputSum {
    public static void main(String[] args) {

        //To get input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to Sum:");
        System.out.println("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Number 2: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;

        //Sum
        System.out.println("Sum is: " + sum);


        /*

        int number1, number2, sum;
        Scanner readNumbers = new Scanner(System.in);
        System.out.println("First number: ");
        number1 = readNumbers.nextInt();

        System.out.println("Second number: ");
        number2 = readNumbers.nextInt();

        readNumbers.close();
        sum = number1 + number2;
        System.out.println("Sum: " + sum);

        */


    }
}
