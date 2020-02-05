import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private Garage garage;


    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.garage = new Garage();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getGarage() {
        return garage.getAllCars();
    }

    public String getName() {
        return name;
    }

    public void setMoney(double money) {
        this.money = money;
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

    public  void buyCar(Car car){
        garage.addCar(car);
        this.money -= car.getPrice();
    }

    public void accident(Car car) {
        double damages = car.getDamage();
        double oldPrice = car.getPrice();
        double newPrice = oldPrice - damages;
        car.setPrice(newPrice);
    }
}
