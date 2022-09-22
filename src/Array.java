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
        String[] food = new String[]{"cake", "porridge", "rice"};

        int[] ageArray = new int[3];


        //processing array
        //only with loops is possible to process the array
        //conventional for-loop
        for (int i = 0; i < fruits.length; i++) {    // i = index of array (0, 1, 3..5)
            System.out.println(fruits[i]);
        }

        //enhanced for-loop (works only for arrays in list)
        for (String fruit : fruits) {      // String : String[] or int : int []
            System.out.println(fruit);
        }

        //Find the largest or maximum value in array
        //Brute-force method
        int result = b[0];  //result 9 //assume the first one is largest, then we compare next one to previous

        for (int x : b) {
            if (x > result) {
                result = x;
            }
        }
        System.out.println(result);


        // Homework4:
        // To find the smallest element in the array (b)


        //Multi-dimensional array
        //2D array

        int[][] array2d = new int[3][3];   //if you don't know how many nr to assign, leave it empty like []
        //Row-1
        array2d[0][0] = 1;
        array2d[0][1] = 0;
        array2d[0][2] = 1;
        //Row-2
        array2d[1][0] = 2;
        array2d[1][1] = 10;
        array2d[1][2] = 9;
        //Row-3
        array2d[2][0] = 4;
        array2d[2][1] = 9;
        array2d[2][2] = 8;

        int[][] array2dVer2 = {{1, 0, 1}, {2, 10, 9}, {4, 9, 8}};  // same version

        //2D array we use two for-loops (nested for; first for explains horizontal axis, second for explains vertical axis)  // x or y < 3, here it means three rows
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(array2d[x][y] + " ");   // " " empty for space between numbers  // use System.out.print only to get table
            }
            System.out.println();
        }

        System.out.println("Hello\nworld\nAvengers!");         // \n between the words prints every word in different line

        System.out.println("Hello\nworld\nAvengers!\tHulk");   // \t gives bigger space in run


        //3D array = 1D + 2D
        //1D = number of tables (can define which table we use)
        //2D array = array with rows and columns

        int[][][] array3d = new int[3][3][3];     // [how many tables][how many rows][how many columns]

        //TABLE-1
        //Row-1
        array3d[0][0][0] = 1;
        array3d[0][0][1] = 0;
        array3d[0][0][2] = 1;
        //Row-2
        array3d[0][1][0] = 1;
        array3d[0][1][1] = 8;
        array3d[0][1][2] = 0;
        //Row-3
        array3d[0][2][0] = 2;
        array3d[0][2][1] = 5;
        array3d[0][2][2] = 7;
        //sout is at next example


        int[][][] array3dVer2 = {
                {{1, 0, 1}, {1, 8, 0}, {2, 5, 7}},              // table1
                {{9, 8, 7}, {5, 8, 9}, {3, 5, 0}},             // table2
                {{5, 6, 2}, {4, 5, 7}, {2, 6, 8}},              // table3
        };

        // three-nested-for
        System.out.println("\n");
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                for (int s = 0; s < 3; s++) {
                    System.out.print(array3dVer2[m][n][s] + "\t");
                }
                System.out.println();
            }
            System.out.println("\n\n");
        }
    }
}


