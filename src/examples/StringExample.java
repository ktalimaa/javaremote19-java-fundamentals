package examples;

/**
 * Examples of String
 * * @author Kristel Talimaa
 */

public class StringExample {
    public static void main(String[] args) {

        String firstName = "Kristel ";
        String lastName = "Talimaa";
        String fullName = firstName + lastName; // option 1

        System.out.println(fullName);

        fullName = firstName.concat(lastName);  // option 2

        String city = "Pärnu";

        String ageString = "My age is: " + 26 + ". I live in " + city + ". My name is: " + fullName;
        System.out.println(ageString);

        String ageStringFormatted = String.format("My age is: %d. I live in %s. My name is: %s", 26, city, fullName);
        System.out.println(ageStringFormatted);     // %d integer, %f for float


        // 62, numbrid lahku 6 ja 2: (6 * 8 pow 1) + (2 * pow 8) = 48 + 2 = 50
        // 36, numbrid lahku 3 ja 6: (3 * 8 pow 1) + (6 * pow 0) = 3 * 8 + 6 * 1 = 30;

        // 2874 = (2 * 8 pow 3) + (8 * 8 pow 2) + (7 * 8 pow 1) + (4 * 8 pow 0), for example: 8 pow 3 = 8 * 8 * 8 = 64
        // (2 * 512) + (8 + 64) + (7 * 8) + (4 * 1) = 1024 + 512 + 56 + 4 = 1596







    }
}
