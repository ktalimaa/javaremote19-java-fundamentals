/**
 * Homework 3: FizzBuzz code in one line
 *
 * @author Kristel Talimaa
 */

public class Homework3 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz": i+ "");
        }
    }
}



