package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Write a program that does the following (the code should be written in separate methods):
 * <p>
 * 1. Generated an array with 10 elements random between 0 and 99. (See Random class in Java).
 * 2. Display the generated array.
 * 3. Display only the odd numbers.
 * 4. Display only the even numbers.
 *
 * @author Kristel Talimaa
 */

public class RandomEven {
    public static void main(String[] args) {

        final int min = 0;          // final = values cannot be changed
        final int max = 99;
        final int arrayLimit = 10;

        int[] array = new int[arrayLimit];

        // Task 1:
        for (int i = 0; i < arrayLimit; i++) {
            array[i] = getRandomNumber(min, max);
        }

        displayArray(array);
        displayOddArray(array);
        displayEvenArray(array);

    }

    // Method to get random numbers
    private static int getRandomNumber(int min, int max) {      // min 0, max 99
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    // Display array
    private static void displayArray(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }

    // To print only odd numbers of array

    private static void displayOddArray(int[] inputArray) {
        List<Integer> oddArrayList = new ArrayList<>();

        for (int number : inputArray) {
            if (number % 2 != 0) {
                oddArrayList.add(number);
            }
        }
        System.out.println("Odd number of the array: ");

        displayArray(convertListToArray(oddArrayList));
    }

    // Converting list to array
    private static int[] convertListToArray(List<Integer> intList) {
        int[] result = new int[intList.size()];

        for (int i = 0; i < intList.size(); i++) {
            Integer number = intList.get(i);
            result[i] = intList.get(i);
        }
        return result;
    }

    // To print only even number of array

    private static void displayEvenArray(int[] inputArray) {
        List<Integer> evenArrayList = new ArrayList<>();

        for (int number : inputArray) {
            if (number % 2 == 0) {
                evenArrayList.add(number);
            }
        }
        System.out.println("Even number of the array: ");

        displayArray(convertListToArray(evenArrayList));
    }


}



