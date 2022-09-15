/**
 * Examples for Java operators
 *
 * @author Kristel Talimaa
 */
public class Operator {

    public static void main(String[] args) {

        //Unary operators (operator with one variable)
        //post-increment
        int i = 0;
        System.out.println(i);
        System.out.println(i++); // 0 (increment here but not used)
        i++; // i + 1 (increment value plus another increment)
        System.out.println(i);

        //post-decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        //pre-decrement
        int j = 10;
        System.out.println(j);
        System.out.println(--j);

        //brackets are the highest priority
        int x = i + (-j); // x = i - j; 2 - 9
        System.out.println(x);

        //binary operators (operator with two variables)
        //arithmetic operators
        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b;
        System.out.println(d);

        int z = i * a + (c / b) - (-j) % x;
        /*
        1. z = i * a + (c / b) + j % x;
         */

        System.out.println(z);


        int divide = 40 / 5; // Quotient value
        System.out.println(divide);

        int modulo = 40 % 7; // Reminder value
        System.out.println(modulo);


        //Comparison operators (==, !=, >, <, >=, <=)
        //Always compare the variables with same data type
        boolean result = divide == modulo; // 8 == 5
        System.out.println(result);

        boolean result2 = divide != modulo; // 8 != 5
        System.out.println(result2);

        boolean lessCheck = divide < modulo; // 8 < 5
        System.out.println(lessCheck);

        boolean greaterCheck = divide > modulo; // 8 > 5
        System.out.println(greaterCheck);

        //Less than or equals
        boolean lessEquals = divide <= modulo; // 8 <= 5
        System.out.println(lessEquals);



        //Logical operators (&&, ||) - and, or
        /*
            true && false = false
            false && true = false
            false && false = false
            true && true = true
         */
        boolean andCheck = (8 < 9) && (10 > 4);
        System.out.println(andCheck);

        /*
            ture || true = true
            false || false = false
            true || false = true
            false || true = true
         */
        boolean orCheck = (8 > 9) || (10 > 4);
        System.out.println(orCheck);

        /* ^ = XOR
        0 = 00000000;
        1 = 00000001;
        2 = 00000010;
        3 = 00000011;
        4 = 00000100;
        5 = 00000101;
        6 = 00000110;
        7 = 00000111;
        8 = 00001000;
        9 = 00001001;
        10 = 00001010;
        11 = 00001011;
        12 = 00001100;
        13 = 00001101;

        0 = false
        1 = true
        true ^ false = true
        false ^ true = true
        true ^ true = false
        false ^ false = false
         */
        float expo = 12 ^ 25; // 12 = 00001100, 25 = 00011001
        /*
        00001100
        00011001
        --------
        00010101 = 21
         */
        System.out.println(expo);


        //Assignment operators
        x = x + y; // both are same
        x += y;
        x /= y;
        x *= y;


        // Ternary operators (?, :) - ? true, : false
        String ternary = (8 > 10) ? "Cat" : "Dog";
        System.out.println(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

       int check2 = !lessCheck ? 9 : 10;

       boolean checkNumber = 9 == 9.0; // int == float
        System.out.println(checkNumber);
           }

}
