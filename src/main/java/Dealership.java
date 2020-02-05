import java.util.ArrayList;

public class Dealership {
    private double till;
    private Garage garage;

    public Dealership() {
        this.till = 0.00;
        this.garage = new Garage();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }


    public ArrayList<Car> getGarage() {
        return garage.getAllCars();
    }

    public int getGarageSize(){
        return getGarage().size();
    }

    public void addCar(Car car){
        garage.addCar(car);
    }

    public void removeCar(Car car){
        garage.removeCar(car);
    }

    public void sellCar(Car car, Customer customer){
        this.till += car.getPrice();
        this.garage.removeCar(car);
        customer.buyCar(car);
    }

    public void buyCar(Car car) {
        this.till -= car.getPrice();
        addCar(car);
    }

    public void accident(Car car) {
        double damages = car.getDamage();
        double oldPrice = car.getPrice();
        double newPrice = oldPrice - damages;
        car.setPrice(newPrice);
    }

    public void repairCar(Car car) {
        double damages = car.getDamage();
        double oldPrice = car.getPrice();
        double newPrice = oldPrice + damages;
        car.setPrice(newPrice);
        this.till -= damages;
    }
}
