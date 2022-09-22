/**
 * Write a Java program to find the number of even and odd integers from an array of integers: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa
 */
public class Homework5B {
    public static void main(String[] args) {

        int[] b = {1, 7, 3, 10, 9};
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0) {
                System.out.print("These are odd numbers: " + b[i] + "\t");


                for (int j = 0; j < b.length; j++) {
                    if (b[j] % 2 == 0) {
                        System.out.println("These are even numbers: " + b[i] + "\t");
                    }
                }
            }
        }
    }
}

