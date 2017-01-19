/**
 * Created by banty on 19/01/17.
 */
public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Luxury car");
    }
}
