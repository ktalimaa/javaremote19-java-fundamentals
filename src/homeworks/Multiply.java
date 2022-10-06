package homeworks;

import java.util.Scanner;

/**
 * In the homework's package, write separate java classes: Add.java, Subtract.java, Multiply.java, Divide.java.
 * All the classes should have a method (For example: addNumbers(int[] numbers)) that takes integer number array as a parameter and do the respective operation.
 * For example: addNumbers method should add all the numbers in the given array and return the integer result.
 *
 * @author Kristel Talimaa
 */

public class Multiply {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers to multiply? ");

        int multiply = scanner.nextInt();
        int[] mulArray = new int[multiply];

        for (int i = 0; i < multiply; i++) {
            System.out.print("Enter your " + (i + 1) + ". number: ");
            mulArray[i] = scanner.nextInt();
        }

        int result = mulArray[0];
        for (int j = 1; j < multiply; j++) {
            result = result * mulArray[j];
        }
        System.out.println("Result: " + result);

    }
}
