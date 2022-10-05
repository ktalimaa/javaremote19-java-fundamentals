package strings;

import java.util.Scanner;

/**
 * To write a program to replace a string.
 *
 * @author Kristel Talimaa
 */
public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        boolean isMatching = false;
        String source = null;

        while (!isMatching) {
            System.out.println("Which string to replace:");
            source = scanner.nextLine();

            /*
            //Check case-sensitive
            if (s.contains(source)) {
                isMatching = true;
            } else {
                System.out.println("String not found! Enter different string.");
            }

             */


            //Check non-sensitive
            String[] sArray = s.split(" ");     //splits array into multiple arrays by words

            for (String word : sArray) {
                if (word.equalsIgnoreCase(source)) {
                    isMatching = true;
                    break;      //once it finds the word, it breaks the loop
                }
            }
            if (!isMatching) {
                System.out.println("String not found! Enter different string.");
            }
        }

        System.out.println("Enter the replacement string:");
        String destination = scanner.nextLine();

        String result = s.replace(source, destination);       // replaces only one string

        //String result = s.replaceAll("\\d", destination);      // \d means replacing numbers (always use two \\ before d) // replaces all the same words in the string, e.g. Estonia -> Eesti multiple times.
        System.out.println(result);
    }
}
