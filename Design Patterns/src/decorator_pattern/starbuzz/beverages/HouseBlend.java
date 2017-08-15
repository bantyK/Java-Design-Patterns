package decorator_pattern.starbuzz.beverages;

import decorator_pattern.starbuzz.base.Beverage;

/**
 * Another subclass of Beverage class
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
