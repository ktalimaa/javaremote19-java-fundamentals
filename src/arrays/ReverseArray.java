package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * To reverse a given array
 *
 * @author Kristel Talimaa
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();

        System.out.println("Enter array elements one after an other");
        int[] arr = new int[arrLength];     //fill this array as user
        int[] reverseArr =  new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input array is: " + Arrays.toString(arr));

        //easiest way to reverse an array is to create new array
        int j = 0;
        for(int i = arrLength-1; i >= 0; i--) {
            reverseArr[j] = arr[i];
            j++;
        }
        System.out.println("Reverse array is: " + Arrays.toString(reverseArr));
    }
}
