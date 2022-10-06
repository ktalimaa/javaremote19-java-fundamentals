package calculator;

import java.util.Scanner;

/**
 * To write a program to do arithmetic operations for the input array read from the user.
 *
 * @author Kristel Talimaa
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULATOR:");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.println("Choose any operation above:");

        int operationChoice = scanner.nextInt();
        System.out.println("How many numbers you want to operate?");
        int totalNumbers = scanner.nextInt();
        int[] inputArray = new int[totalNumbers];      // how many nr

        System.out.println("Enter the numbers one after the other:");

        for (int i = 0; i < totalNumbers; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int result = 0;

        switch (operationChoice) {
            case 1:
                Add add = new Add();    // create new object, addArray
                result = add.addArray(inputArray);
                break;
            case 2:
                Subtract subtract = new Subtract();
                result = subtract.subtractArray(inputArray);
                break;
            case 3:
                Multiply multiply = new Multiply();
                result = multiply.multiplyArray(inputArray);
                break;
            case 4:
                Divide divide = new Divide();
                result = divide.divideArray(inputArray);
                break;
            default:
                System.out.println("Invalid operation!");
        }

        System.out.println("Result: " + result);

    }
}
