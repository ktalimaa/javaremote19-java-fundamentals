package basics;

import java.util.Scanner;

/**
 * To get input from user and print it.
 *
 * @author Kristel Talimaa *
 */

public class Hello {
    public static void main(String[] args) {
        System.out.println("Welcome to my first exercise!");

        Scanner scanner = new Scanner(System.in);       //scanner is used to get the input from the user.

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();        //nextLine - whatever is stored to this variable, used for string

        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();            //nextInt - use for numbers

        System.out.println("Do you live in Tallinn?");      //on te run box, print true or false
        boolean isLivingInTallinn = scanner.nextBoolean();

        System.out.println("Age is : " + age + ".");
        System.out.println("Am I living in Tallinn: " + isLivingInTallinn + ".");
    }
}
