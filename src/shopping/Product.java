package shopping;

/**
 * Create class product, it should contain at least two fields - name and price.
 * Create an empty array of products - it's size should be at least 5.
 * Populate the array with same products - this array represents the menu for the user.
 * Simulate the process of shopping:
 * ask for a product,
 * add it to the cart (array),
 * change index,
 * if index will be greater than 5 - finish shopping.
 * pay for the products.
 *
 * @author Kristel Talimaa
 */
public class Product {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}


