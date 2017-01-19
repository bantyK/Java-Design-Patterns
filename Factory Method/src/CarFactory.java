public class CarFactory {
    public static Car buildCar(CarType type){
        Car car = null;

        switch(type){
            case SEDAN:
                car = new SedanCar();
                break;
            case SMALL:
                car = new SmallCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                return null;
        }
        return car;
    }
}
