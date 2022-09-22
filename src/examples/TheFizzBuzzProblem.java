package examples;

/**
 * The Fizz Buzz Problem
 *
 * @author Kristel Talimaa
 */
public class TheFizzBuzzProblem {
    public static void main(String[] args) {

        // Write a program which prints "Fizz" if the number is a multiplier of 3
        // prints "buzz" if its multiplier of 5 and prints "fizzbuzz" if the number is divisible by both 3 and 5.


        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

    }
}
