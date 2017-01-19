public class Meal {
    private String sandwich;
    private String sideOrder;
    private String drink;
    private String offer;
    private double price;

    @Override
    public String toString() {
        return "Sandwich=" + sandwich + " Side Order=" + sideOrder + " Drink="
                + drink + " Offer=" + offer + " Price=" + price;
    }

    public void setSandwich(String sandwich) {
        this.sandwich = sandwich;
    }

    public void setSideOrder(String sideOrder) {
        this.sideOrder = sideOrder;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSandwich() {
        return sandwich;
    }

    public String getSideOrder() {
        return sideOrder;
    }

    public String getDrink() {
        return drink;
    }

    public String getOffer() {
        return offer;
    }

    public double getPrice() {
        return price;
    }
}
