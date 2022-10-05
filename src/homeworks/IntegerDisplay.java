package homeworks;

import java.util.Scanner;

/**
 * To read a number from user and print the same number as this:
 * e.g. if given number is 4, then print:
 * 4, 44, 444, 4444
 *
 * @author Kristel Talimaa
 */
public class IntegerDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {  // first loop is to print number of lines/times
            for (int j = 1; j <= i; j++) {   // second loop is to print number of digits
                System.out.print(number);    // use just print
            }
            System.out.println();
        }

        // same triangle but opposite way
        for (int i = number; i >= 1; i--) {  // first loop is to print number of lines/times
            for (int j = i; j >= 1; j--) {   // second loop is to print number of digits
                System.out.print(number);    // use just print
            }
            System.out.println();
        }



        /*
        My version:
        System.out.println("Print number to display: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("The result of numbers: ");
        for (int a = 0; a < n; a++) {
            System.out.print(" ");
            for (int b = 0; b <= a; b++) {
                System.out.print(n + "\t");
            }
        }

         */


    }
}
