package decorator_pattern.starbuzz.base;

/*
* Beverage : Abstract class, which all the decorators and concrete classes
* are going to extend
* */
public abstract class Beverage {
    protected String description = "Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost(); //every beverage will implement its own cost

    @Override
    public String toString() {
        return description + " : $" + cost();
    }
}
