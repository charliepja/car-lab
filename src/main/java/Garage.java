import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars;

    public Garage() {
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car newCar) {
        this.cars.add(newCar);
    }

    public int getCarIndex(Car newCar) {
       return this.cars.indexOf(newCar);
    }

    public Car getCar(Car newCar) {
        return this.cars.get(getCarIndex(newCar));
    }

    public void removeCar(Car newCar) {
        this.cars.remove(getCar(newCar));
    }

    public ArrayList<Car> getAllCars() {
        ArrayList<Car> carClone = new ArrayList<Car>();
        carClone = this.cars;
        return carClone;
    }
}
