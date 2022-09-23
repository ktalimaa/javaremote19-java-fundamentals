/**
 * Write a Java program to find the number of even and odd integers from an array of integers: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa
 */
public class Homework5B {
    public static void main(String[] args) {

        int[] b = {1, 7, 3, 10, 9};
        int a = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0)
                a++;
        }
        System.out.println("Number of even numbers: " + a);
        System.out.println("Number of odd number: " + (b.length - a));
    }
}





