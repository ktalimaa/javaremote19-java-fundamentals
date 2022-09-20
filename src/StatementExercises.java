public class StatementExercises {

    public static void main(String[] args) {
        int i;

        // solution 1 - using if-else
                for (i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even number");
            } else {
                System.out.println("This is odd number");
            }
        }

        // solution 2 - using ternary operator
        for (i = 0; i <= 20; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + "number"); // i is even/odd number

        }
    }
}
