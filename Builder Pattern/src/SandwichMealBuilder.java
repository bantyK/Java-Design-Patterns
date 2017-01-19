public class SandwichMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void addSandwich(String sandwich) {
        meal.setSandwich(sandwich);
    }

    @Override
    public void addSides(String sides) {
        meal.setSideOrder(sides);
    }

    @Override
    public void addDrink(String drink) {
        meal.setDrink(drink);
    }

    @Override
    public void addOffer(String offer) {
        meal.setOffer(offer);
    }

    @Override
    public void addPrice(double price) {
        meal.setPrice(price);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
