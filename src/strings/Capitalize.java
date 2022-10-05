package strings;

import java.util.Scanner;

/**
 * To write a Java program to change the string to upper case
 *
 * @author Kristel Talimaa
 */
public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());

        // System.out.println(input.length());     // sum of digits
    }
}
