package decorator_pattern.starbuzz.beverages;

import decorator_pattern.starbuzz.base.Beverage;

/**
 * Created by banty on 15/8/17.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Regular Decaf coffee";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
