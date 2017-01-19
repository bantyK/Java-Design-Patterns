/**
 * Created by banty on 19/01/17.
 */
public abstract class Car {

    private CarType model;

    public Car(CarType type) {
        this.model = type;
        arrangeParts();
    }

    private void arrangeParts() {

    }

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }


}
