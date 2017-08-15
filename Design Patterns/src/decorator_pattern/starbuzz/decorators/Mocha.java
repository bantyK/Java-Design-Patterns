package decorator_pattern.starbuzz.decorators;

import decorator_pattern.starbuzz.base.Beverage;
import decorator_pattern.starbuzz.base.Decorator;

public class Mocha extends Decorator {
    //Instance of the base class, which this decorator will wrap
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
