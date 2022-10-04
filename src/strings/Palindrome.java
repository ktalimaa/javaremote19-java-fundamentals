package strings;

import java.util.Scanner;

/**
 * To check a given word is a palindrome (word when reversed is same, e.g. race car)
 *
 * @author Kristel Talimaa
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();        //empty string, because we have to find the reverse word

        //MADAM - have to check each character, all characters must be upper or lower case
        for(int i = word.length() -1; i >= 0; i--) {// i = we start from the last character of the string. -1 is because string or int arrays starts with 0. use > when need to reverse.
        reverseWord.append(word.charAt(i));
        }

        if(word.equalsIgnoreCase(reverseWord.toString())) {     //ignore case ignores upper or lower case
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome"); // can be like this way too: System.out.println("The given word is " + (word.equals(reverseWord) ? "" : "not")    + " is a palindrome!");
        }

    }
}
