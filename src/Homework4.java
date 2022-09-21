/**
 * Find the smallest element in the array
 *
 * @author Kristel Talimaa
 */
public class Homework4 {
    public static void main(String[] args) {

        int[] b = {9, 27, 40, 20, 839, 11000};

        int result = b[0];

        for (int x : b) {
            if (x < result) {
                result = x;
            }
        }
        System.out.println(result);
    }
}

