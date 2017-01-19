import org.junit.Test;

import static org.junit.Assert.*;

public class CarFactoryTest {
    @Test
    public void shouldReturnSmallCar() throws Exception {
        Car car = CarFactory.buildCar(CarType.SMALL);

        assertEquals(CarType.SMALL,car.getModel());
    }

    @Test
    public void shouldReturnLuxuryCar() throws Exception {
        Car car = CarFactory.buildCar(CarType.LUXURY);

        assertEquals(CarType.LUXURY,car.getModel());
    }

    @Test
    public void shouldReturnSedanCar() throws Exception {
        Car car = CarFactory.buildCar(CarType.SEDAN);

        assertEquals(CarType.SEDAN,car.getModel());

    }
}