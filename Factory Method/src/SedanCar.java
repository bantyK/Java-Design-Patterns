/**
 * Created by banty on 19/01/17.
 */
public class SedanCar extends Car {
    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Sedan Car");
    }
}
