package examples.objects;

/**
 * Default Consturctor example
 *
 * @author Kristel Talimaa *
 */
public class Traffic {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Audi Q7";           //goes to garbage collection, because we don't use it anymore in this program

        Car car2 = new Car();
        car2.name = "BMW X5";

        Car car3 = new Car();           //same class different objects can hold different values
        car3.name = "Ford Mustang";

        car.name = "Toyota RAV4";      //changes out the Audi Q7, Java reads only the last one

        Car car4 = new Car();
        car4 = car2;                   //sets value from one object to another

        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);

        System.gc();         // frees garbage collection

    }
}
