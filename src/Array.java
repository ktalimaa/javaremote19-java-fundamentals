/**
 * Examples of Arrays
 *
 * @author Kristel Talimaa
 */
public class Array {
    public static void main(String[] args) {
        int a = 9;

        //Single-dimensional array
        //Note: Array index always starts with 0
        //Infinite array
        //int array
        int[] b = {9, 27, 40, 20, 839, 11000};      // square brackets - then it is called array. only same type values in curly brackets.

        //String array
        String[] fruits = {"apple", "orange", "mango", "apple", "banana", "mango"};     // index = 0, 1, 2... // values can be duplicated // number between " " is also a String // can also use boolean etc. array index starts with 0. Apple is 0, orange 1..

        System.out.println(fruits[0]);
        System.out.println(b[4]);
        System.out.println(fruits[4]); //Array index out of bound

        System.out.println(b.length);  //return the number of values in array

        System.out.println(b.length - 1); //return array's last index, result is 5 because index start 0, 1, 2..

        //defined array
        String[] veggies = new String[5];  // 'new' means creating new object // 5 in brackets - you can only add 5 values here

        veggies[3] = "potato";
        veggies[4] = "carrot";

        System.out.println(veggies[1]);

        //second version to define, same meaning
        String[] food = new String[]{"cake", "porrdige", "rice"};

        int[] ageArray = new int[3];


        //processing array
        //only with loops is possible to process the array
        //conventional for-loop
        for(int i = 0; i < fruits.length; i++) {    // i = index of array (0, 1, 3..5)
            System.out.println(fruits[i]);
        }

        //enhanced for-loop (works only for arrays in list)
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Find the largest or maximum value in array
        //Brute-force method
        int result = b[0];  //result 9 //assume the first one is largest, then we compare next one to previous

        for(int x: b) {
            if(x > result) {
            result = x;
            }
        }
        System.out.println(result);


        // Homework4:
        // To find smallest element in the array (b)
    }
}
