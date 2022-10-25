package petrolstation;

import java.util.Random;
import java.util.Scanner;

/**
 * Petrol Station:
 * Simulate the process of refueling. Within the while loop ask user if you should continue or finish.
 * For every entered “continue” command you should add a specific amount of petrol and money (both of type double)
 * and view it on the console.
 * <p>
 * At the end user should pay for petrol. Consider multiple possibilities, like:
 * The user paid exactly as much as required.
 * The user paid too much (cashier should return the rest of the money).
 * The user paid too little – should be asked for the rest.
 *
 * @author Kristel Talimaa *
 */

public class PetrolStation {

    private static final double PETROL_PRICE_PER_LITRE = 1.998;
    private static final double THRESHOLD_AMOUNT = 5;
    private static final String CURRENCY = "EUR";
    static double totalQuantity = 0;
    static double totalAmount = 0;

    public static void main(String[] args) {
        System.out.println("WELCOME TO PETROL STATION");
        System.out.println("=========================");
        System.out.println("Today's petrol price: " + PETROL_PRICE_PER_LITRE + CURRENCY);
        System.out.println();

        System.out.println("Do you want to refill the tank? (true/false)");

        while (isContinue()) {
            totalQuantity += THRESHOLD_AMOUNT;
            totalAmount = totalQuantity * PETROL_PRICE_PER_LITRE;

            displayCart();
            System.out.println("Do you want to fill more? (true/false)");
        }

        System.out.println("Thanks for fueling!");
        displayCart();

        // Payment
        if (totalAmount > 0) {
            System.out.println("Do you wish to pay now? (true/false)");

            if (isContinue()) {
                boolean isMoneyPaid = false;

                while (!isMoneyPaid) {
                    double money = getMoney();
                    System.out.println("Money paid: " + money + CURRENCY);
                    String message = "Thanks for the payment! Visit us again!";

                    if (money == totalAmount) {     // The user paid exactly as much as required.
                        System.out.println(message);
                        isMoneyPaid = true;
                    } else if (money > totalAmount) {       // The user paid too much (cashier should return the rest of the money).
                        double balance = money - totalAmount;
                        System.out.println("Balance returned: " + balance + CURRENCY);
                        System.out.println(message);
                        isMoneyPaid = true;
                    } else {  // The user paid too little – should be asked for the rest.
                        System.out.println("The amount is paid is lesser than the total amount! Please pay the correct amount.");
                    }
                }
            } else {
                System.out.println("Invoice will be sent to you! Thank you!");
            }
        }
    }

    private static boolean isContinue() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect answer. Please enter again:";
        boolean checker = false;
        boolean answer = false;

        do {
            if (!scanner.hasNextBoolean()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                answer = scanner.nextBoolean();
                checker = true;
            }
        } while (!checker);

        return answer;
    }

    private static void displayCart() {
        System.out.println("Total fuel refilled: " + totalQuantity + " litres");
        System.out.println("Total amount: " + totalAmount + CURRENCY);
    }

    private static int getMoney() {
        return new Random().nextInt(2000 - 1) + 1;
    }
}
