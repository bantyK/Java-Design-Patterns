package decorator_pattern.starbuzz.beverages;

import decorator_pattern.starbuzz.base.Beverage;

/**
 * Concrete Beverage class
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso"; //overiding the description instance variable of the base "Beverage" class
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
