package shopping;

public class Cart {
    private ProductLine[] products;
    private float totalPrice;

    public ProductLine[] getProducts() {
        return products;
    }

    public void setProducts(ProductLine[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
