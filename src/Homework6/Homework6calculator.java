/**
 * Calculating the result of Homework6. Array: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa
 */

package Homework6;

import java.util.Arrays;

public class ArrayFinder {
    public String findSecondElement(int[] arrayToCalculate) {
        String result = "";

        Arrays.sort(arrayToCalculate);
        int x = arrayToCalculate.length - 1;
        while (arrayToCalculate[x] == arrayToCalculate[arrayToCalculate.length - 1]) {
            x--;
        }
        System.out.println("Second largest value is: " + arrayToCalculate[x]);
        return result;
    }
}
