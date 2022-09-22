/**
 * Write a Java program to print all odd numbers from an array: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa
 */
public class Homework5A {
    public static void main(String[] args) {

        int[] a = {1, 7, 3, 10, 9};
        System.out.print("These are odd numbers: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + "\t");
            }
        }
    }

}
