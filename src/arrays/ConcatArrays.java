package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Create two arrays:
 * gasolineCars;
 * electricCars.
 * <p>
 * Join the array &
 * <p>
 * result will be all cars.
 *
 * @author Kristel Talimaa
 */

public class ConcatArrays {
    public static void main(String[] args) {
        String[] gasolineCars = {"AUDI A5", "LAMBO URUS", "BMW X5", "MERCEDES s500"};
        String[] electricCars = {"TESLA MODEL3", "NISSAN LEAF", "VW UP", "FORD MUSTANG"};
        List<String[]> allCars = Arrays.asList(gasolineCars, electricCars);

        String[] allCars2 = new String[gasolineCars.length + electricCars.length];

        for (int i = 0; i < gasolineCars.length; i++) {
            allCars2[i] = gasolineCars[i];
        }

        for (int i = 0; i < electricCars.length; i++) {
            allCars2[i + gasolineCars.length] = electricCars[i];
        }

        System.out.println(allCars);
        System.out.println(Arrays.toString(allCars2));


    }
}
