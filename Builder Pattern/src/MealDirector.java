public class MealDirector {
    public Meal makeMeal(MealBuilder builder){
        builder.addSandwich("Hamburger");
        builder.addSides("Fries");
        builder.addDrink("Coke");
        builder.addOffer("Weekend Off");
        builder.addPrice(10.50);
        return builder.getMeal();
    }
}
