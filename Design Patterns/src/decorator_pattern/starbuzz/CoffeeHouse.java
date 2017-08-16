package decorator_pattern.starbuzz;

import decorator_pattern.starbuzz.base.Beverage;
import decorator_pattern.starbuzz.beverages.DarkRoast;
import decorator_pattern.starbuzz.beverages.Espresso;
import decorator_pattern.starbuzz.decorators.Mocha;
import decorator_pattern.starbuzz.decorators.Whip;

/**
 * Created by banty on 15/8/17.
 * Main class to create and use beverage and decorators
 */
public class CoffeeHouse {
    public static void main(String[] args) {
        //plain coffee with no condiments
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        //Dark roast decorated with 2 mocha and 1 whip
        Beverage darkRoast = new DarkRoast();
        //adding mocha to it
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDescription());
        //adding second mocha
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDescription());
        //adding 1 whip to it
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription());

    }
}
