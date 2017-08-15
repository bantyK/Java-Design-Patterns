package decorator_pattern.starbuzz.base;

/**
 * The base class for all the decorators
 *
 * Decorators are also a subclass of Beverage
 */
public abstract class Decorator extends Beverage {
    public abstract String getDescription(); // every decorator need to implement their own description
}
