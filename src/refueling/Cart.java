package refueling;

public class Cart {

    private PetrolProductLine[] fuels;

    private float totalPrice;

    public PetrolProductLine[] getFuels() {
        return fuels;
    }

    public void setFuels(PetrolProductLine[] fuels) {
        this.fuels = fuels;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
