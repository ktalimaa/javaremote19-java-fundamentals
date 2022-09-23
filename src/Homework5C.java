/**
 * Write a Java program to find the duplicate values of an array of integer values: [1, 7, 3, 7, 10, 1, 9].
 *
 * @author Kristel Talimaa
 */
public class Homework5C {
    public static void main(String[] args) {

        int[] c = {1, 7, 3, 7, 10, 1, 9};

        for (int x = 0; x < c.length - 1; x++) {
            for (int y = x + 1; y < c.length; y++) {
                    if ((c[x] == (c[y])) && (x != y)) {
                        System.out.println("Duplicate is: " + c[y]);
                    }
                }
            }
        }
    }

