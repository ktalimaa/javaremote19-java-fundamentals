/**
 * Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number: [1, 2, 7, 3, 10, 2, 9] with sum 4.
 * {(1,2), (3, 4), (4,8)}
 *
 * @author Kristel Talimaa
 */
package examples;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 3, 10, 2, 9};
        int sum = 4;
        ArrayPairCalculator arrayPairCalculator = new ArrayPairCalculator();
        String result = arrayPairCalculator.findAllPairsOfSum(array, sum);

        System.out.println(result);
    }
}













