package decorator_pattern.starbuzz.decorators;

import decorator_pattern.starbuzz.base.Beverage;
import decorator_pattern.starbuzz.base.Decorator;

/**
 * Created by banty on 15/8/17.
 */
public class Whip extends Decorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
