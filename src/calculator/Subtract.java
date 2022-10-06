package calculator;

import java.util.Scanner;

/**
 * In the homework's package, write separate java classes: Add.java, Subtract.java, Multiply.java, Divide.java.
 * All the classes should have a method (For example: addNumbers(int[] numbers)) that takes integer number array as a parameter and do the respective operation.
 * For example: addNumbers method should add all the numbers in the given array and return the integer result.
 *
 * @author Kristel Talimaa
 */

public class Subtract {
    public int subtractArray(int[] subtractArray) {

        int result = 0;
        for (int j = 0; j < subtractArray.length; j++) {
            result = subtractArray[j];
        }
        return result;
    }
}
