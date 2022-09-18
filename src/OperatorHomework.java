/**
 * Operator homework
 *
 * @author Kristel Talimaa
 */
public class OperatorHomework {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println(c);
        int i = 1;
        int j = 2;
        int k = 3;
        int l = 6;
        int x = i + (-j);
        System.out.println(x);
        int t = b / i;
        System.out.println(t);

        int y = t * (b / a) + c / k + (i * l) - (-j) % x;
        System.out.println(y);

        /*
        Steps of solutions:
        1. y = t * (b / a) + c / k + (i * l) + 2% x;
        2. y = t * (b / a) + c / k + (i * l) + 0; // Result of '(-j) % x' is always '0'
        3. y = t * 2 + c / k + (i * l);
        4. y = t * 2 + c / k + 6;
        5. y = 20 + c / k + 6;
        6. y = 20 + 5 + 6;
        7. y = 31

         */
    }
}

