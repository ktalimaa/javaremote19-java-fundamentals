/**
 * Write a Java program to find the number of even and odd integers from an array of integers: [1, 7, 3, 10, 9].
 *
 * @author Kristel Talimaa
 */
public class Homework5B {
    public static void main(String[] args) {

        int[] b = {1, 7, 3, 10, 9};
            System.out.print("These are odd numbers: ");
            for (int i = 0; i < b.length; i++) {
                if (b[i] % 2 != 0) {
                    System.out.print(b[i] + "\t");

                System.out.println("These are even number: ");
                for (int j = 0; j < b.length; j++) {
                    if (b[j] % 2 == 0) {
                        System.out.println(b[j] + "\t");
                    }
                }
            }
        }
    }
}
