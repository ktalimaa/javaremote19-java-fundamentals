package basics;

import java.util.Scanner;

/**
 * To calculate area and perimeter of the circle
 * Area = Pi r sq.
 * Perimeter = 2 Pi radius
 *
 * @author Kristel Talimaa
 */

public class Perimeter {
    public static void main(String[] args) {

        final float pi = 3.14f; // to define constant value use "final". value of this pi will not be changed
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();

        //Area
        float area = pi * (radius * radius);

        //Perimeter (circumference)
        float perimeter = 2 * pi * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
