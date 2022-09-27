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


        //String builder
        //append - automatically joins to the same variable
        StringBuilder str1 = new StringBuilder("Hello!");
        StringBuilder str2 = str1.append("World");   // append = add
        System.out.println(str2);
        System.out.println(str1);

        //need to assign to the variable additionally
        String var1 = "Red";
        var1.concat("Yellow");
        String var2 = "Blue";
        System.out.println(var1);
        System.out.println(var2);


        //Equality
        // == is used only for memory reference and value
        // string.equals() is used to compare only the value

        String s1 = "Sibul";       //String Pool
        String s2 = "Sibul";       //String Pool
        String s3 = new String("Sibul");        //Heap
        String s4 = new String("Sibul");        //Heap

        System.out.println(s1 == s3);       //comparing the value and false because the s3 (new before string) is stored in heap, but s1 in string pool
        System.out.println(s1 == s2);       //same memory
        System.out.println(s3 == s4);       //false because memory references are different

        System.out.println(s1.equals(s3));      //true because it compares only values

    }
}
