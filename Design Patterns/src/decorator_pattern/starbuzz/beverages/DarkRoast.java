package decorator_pattern.starbuzz.beverages;

import decorator_pattern.starbuzz.base.Beverage;

/**
 * Created by banty on 15/8/17.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
