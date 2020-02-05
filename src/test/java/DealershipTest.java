import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DealershipTest {

    private Dealership dealer;
    private Car car;

    @Before
    public void before(){
        dealer = new Dealership();
        Engine engine = new Engine(1200, 35, FuelType.ELECTRIC);
        Tyre tyre = new Tyre(24, "Michelin");
        GearBox gears = new GearBox(GearBoxType.AUTOMATIC);
        Frame frame = new Frame(5, FrameType.SUV);
        Wheel wheel = new Wheel(tyre, 24, WheelType.ALLOY);
        int numberOfWheels = 4;
        String make = "Ford";
        String model = "Fiesta";
        double price = 10000.50;
        String colour = "Blue";
        double damage = 1000.50;
        this.car = new Car(engine, gears, frame, wheel, numberOfWheels, make, model, price, colour, damage);
        dealer.addCar(car);
    }

    @Test
    public void canGetTill(){
    assertEquals(0, dealer.getTill(), 0.00);
    }

    @Test
    public void canGetGarage(){
        assertEquals(1, dealer.getGarageSize());
    }

    @Test
    public void canAddCar(){
        dealer.addCar(car);
        assertEquals(2, dealer.getGarageSize());
    }

    @Test
    public void canRemoveCar(){
        dealer.removeCar(car);
        assertEquals(0, dealer.getGarageSize());
    }

    @Test
    public void canSellCarToCustomer(){
        Customer customer = new Customer("The Stig", 30000.00);
        dealer.sellCar(car, customer);
        assertEquals(0, dealer.getGarageSize());
        assertEquals(1, customer.getGarageSize());
        assertEquals(10000.50, dealer.getTill(), 0.000);
        assertEquals(19999.50, customer.getMoney(), 0.000);

    }

    @Test
    public void canBuyCar() {
        dealer.buyCar(car);
        assertEquals(2, dealer.getGarageSize());
        assertEquals(-10000.50, dealer.getTill(), 0.01);
    }

    @Test
    public void canGetIntoAccident() {
        dealer.accident(car);
        assertEquals(9000.00, car.getPrice(), 0.01);
    }

    @Test
    public void canRepairCar() {
        dealer.accident(car);
        dealer.repairCar(car);
        assertEquals(-1000.50, dealer.getTill(), 0.01);
        assertEquals(10000.50, car.getPrice(), 0.01);
    }
}
