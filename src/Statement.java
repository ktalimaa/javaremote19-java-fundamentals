/**
 * Statement examples
 *
 * @author Kristel Talimaa
 */
public class Statement {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;
        String name = "Kristel";

        if (name == "Kristel" && name != "Talimaa") {
            System.out.println("The name is correct");
        }

        if ((i > y && y > 0) || i == 100) {
            System.out.println("i is greater than y");
        }

        System.out.println("This is simple program");

         /*
        if(shirt size == M && shirt colour == black) {
        //buy the shirt
        } else {
        //buy the shirt from another shop
         */

        if(i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.println("y is greater than i");
        }


        /*
        if(shirt size == M && shirt colour == black) {
        //buy the shirt
        } else if(shirt size == M && shirt colour == blue) {
        //buy the shirt
        } else {
        //buy the shirt from another shop
        }
         */


        if(i > y) {
            System.out.println("i is greater than y");
        } else if(i < 9) {
            System.out.println("i is lesser");
        } else {
            System.out.println("i is invalid");
        }



    }
}
