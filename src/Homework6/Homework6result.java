/**
 * Write a Java program to find the second-largest element in an array: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa
 */
package Homework6;

import java.util.Arrays;

public class Homework6result {
    public static void main(String[] args) {
        int[] arrayToCalculate = {1, 7, 3, 10, 9};

        Homework6calculator arrayFinder = new Homework6calculator();

        String result = arrayFinder.findSecondElement(arrayToCalculate);

        System.out.println(result);
    }
}
