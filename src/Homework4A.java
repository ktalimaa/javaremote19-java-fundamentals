/**
 * Homework 5: Write a Java program to calculate the average value of array elements: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa
 */

public class Homework4A {
    public static void main(String[] args) {

        int [] y = {1, 7, 3, 10, 9};
        int sum = 0;
        for (int k: y) {
            sum += k;
        }
        int average = sum / y.length;
        System.out.println("The average is " + average);
        }
    }

