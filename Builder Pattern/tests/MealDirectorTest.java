import org.junit.Test;

import static org.junit.Assert.*;

public class MealDirectorTest {
    @Test
    public void name() throws Exception {
        MealBuilder builder = new SandwichMealBuilder();
        MealDirector director = new MealDirector();
        builder.addSandwich("Hamburger");
        Meal meal = director.makeMeal(builder);
        assertEquals("Hamburger",meal.getSandwich());

    }
}