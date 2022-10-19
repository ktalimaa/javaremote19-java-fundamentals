package refueling;

import shopping.Cart;
import shopping.Product;
import shopping.ProductLine;

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
    public static void main(String[] args) {

    }

    private static Fuel[] getRandomFuels() {

        Fuel petrol1 = new Fuel();
        petrol1.setName("Petrol 98");
        petrol1.setPrice(1.999f);

        Fuel petrol2 = new Fuel();
        petrol2.setName("Petrol 95");
        petrol2.setPrice(1.949f);

        Fuel diesel1 = new Fuel();
        diesel1.setName("Diesel");
        diesel1.setPrice(1.989f);

        Fuel diesel2 = new Fuel();
        diesel2.setName("Diesel miles plus");
        diesel2.setPrice(1.996f);

        return new Fuel[]{petrol1, petrol2, diesel1, diesel2};
    }

    private static void mainMenu(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        int mainMenuOption = displayMainMenu();

        switch (mainMenuOption) {
            case 1:        // choose fuel
                boolean hasMoreRefueling = false;
                int counter = 0;
                int fuelLimit = 1;
                float totalPrice = 0;
                PetrolProductLine[] fuels = new PetrolProductLine[fuelLimit];

                do {
                    if (counter >= fuelLimit) {
                        System.out.println("Refueling finished. Please proceed to pay!");
                        break;
                    }

                    PetrolProductLine petrolProductLine = getFuelToCart();

                    if (petrolProductLine == null) {
                        mainMenu(cart);
                    } else {

                        fuels[counter] = petrolProductLine;      // if you want to add more fuel, use loop
                        cart.getProducts(fuels);
                        totalPrice += petrolProductLine.getPrice();
                        cart.setTotalPrice(totalPrice);

                        System.out.println("Do you want add more fuel?");
                        String errorMessage = "Incorrect answer! Please enter again:";
                        boolean checker = false;

                        do {
                            if (!scanner.hasNextBoolean()) {
                                System.out.println(errorMessage);
                                scanner.next();
                            } else {
                                hasMoreRefueling = scanner.nextBoolean();
                                checker = true;
                            }
                        } while (!checker);

                        if (hasMoreRefueling) {
                            counter++;
                        }
                    }
                } while (hasMoreRefueling);

                mainMenu(cart);
                break;

            case 2:
                cart = cartMenu(cart);
                break;

            case 3:
                System.out.println("Thanks for refueling!");
                break;
        }
    }

    private static int displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MAIN MENU \n-------------------");
        System.out.println("1. Show fuels \n2. Cart \n3. Exit");
        System.out.println("Choose an option form above:");

        return getMenuOption(3);
    }

    private static PetrolProductLine getFuelToCart() {
        System.out.println("MAIN MENU \n-------------------");

        // To get random fuels to display
        Fuel[] fuels = getRandomFuels();

        // Displaying the fuels
        for (int i = 0; i < fuels.length; i++) {
            System.out.println(i + ". " + fuels[i].getName());
        }

        System.out.println(fuels.length + ". " + "Exit to main menu");

        // To get option for fuel
        System.out.println("Choose an option from above:");
        int fuelChoice = getMenuOption(fuels.length);

        if (fuelChoice == fuels.length) {
            return null;
        } else {
            System.out.println("Enter quantity (L):");
            Scanner scanner = new Scanner(System.in);
            float quantity = 0;
            String errorMessage = "Incorrect quantity! Please enter again:";

            do {
                if (!scanner.hasNextFloat()) {
                    System.out.println(errorMessage);
                    scanner.next();
                } else {
                    quantity = scanner.nextFloat();

                    if (quantity <= 0) {
                        System.out.println(errorMessage);
                    }
                }
            } while (quantity <= 0);


            // Price calculation
            float price = fuels[fuelChoice].getPrice() * quantity;

            // Creating product line for cart
            PetrolProductLine petrolProductLine = new PetrolProductLine();
            petrolProductLine.setFuel(fuels[fuelChoice]);
            petrolProductLine.setQuantity(quantity);
            petrolProductLine.setPrice(price);

            return petrolProductLine;
        }
    }

    private static Cart cartMenu(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        int cartMenuOption = displayCartMenu();

        switch (cartMenuOption) {
            case 1:     // display the cart
                int counter = 1;

                if (cart != null) {
                    for (PetrolProductLine fuel : cart.getProducts()) {
                        if (fuel != null) {
                            System.out.println(counter + ". " + fuel.getFuel().getName() + ". " + fuel.getQuantity() + fuel.getPrice());
                        }
                        counter++;
                    }

                    System.out.println("Total price: " + cart.getTotalPrice());
                    System.out.println("Do you want to go to back to the cart menu?");
                    String errorMessage = "Incorrect answer! Please enter again:";
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

                    if (answer) {
                        cartMenu(cart);
                    } else {
                        boolean isPaid = isPaymentDone();

                        if (isPaid) {
                            cart = new Cart();
                            mainMenu(cart);
                        } else {
                            cartMenu(cart);
                        }
                    }
                } else {
                    System.out.println("Cart is empty!");
                    System.out.println("Going back to cart menu...");
                    cartMenu(null);
                }
                break;

            case 2:     // for the payment
                if (cart.getTotalPrice() <= 0) {
                    System.out.println("Nothing to pay! Going back to Main menu...");
                    mainMenu(cart);
                } else {
                    boolean isPaid = isPaymentDone();

                    if (isPaid) {
                        cart = new Cart();
                        mainMenu(cart);
                    } else {
                        cartMenu(cart);
                    }
                }
                break;

            case 3:     // go back to main menu
                mainMenu(cart);
                break;
        }
        return cart;
    }

    private static boolean isPaymentDone() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect answer! Please enter again:";
        System.out.println("Do you want to pay?");
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

        if (answer) {
            System.out.println("Payment successful! Going back to Main menu...");
            return true;
        } else {
            System.out.println("Payment unsuccessful! Going back to Cart menu...");
            return false;
        }
    }

    private static int displayCartMenu() {
        System.out.println("CART MENU \n---------------");
        System.out.println("1. Cart \n2. Pay \n3. Exit to main menu");
        System.out.println("Choose an option form above:");

        return getMenuOption(3);
    }

    private static int getMenuOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option! Please enter again:";
        int option = limit + 1;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt();

                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);

        return option;
    }


}
