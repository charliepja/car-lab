import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private Car car;
    private Dealership dealer;

    @Before
    public void before(){
        dealer = new Dealership();
        customer = new Customer("The Stig", 30000.00);
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
    }

    @Test
    public void CanGetMoney(){
        assertEquals(30000.00, customer.getMoney(), 0.00);
    }

    @Test
    public void CanSetMoney(){
        customer.setMoney(40000);
        assertEquals(40000, customer.getMoney(), 0.000);
    }

    @Test
    public void CanGetGarage(){
        assertEquals(0, customer.getGarageSize());
    }

    @Test
    public void CanGetName(){
        assertEquals("The Stig", customer.getName());
    }

    @Test
    public void canAddCar(){
        customer.addCar(car);
        assertEquals(1, customer.getGarageSize());
    }

    @Test
    public void canRemoveCar(){
        customer.addCar(car);
        customer.removeCar(car);
        assertEquals(0, customer.getGarageSize());
    }

    @Test
    public void canBuyCar(){
        dealer.addCar(car);
        Customer customer = new Customer("The Stig", 30000.00);
        dealer.sellCar(car, customer);
        assertEquals(0, dealer.getGarageSize());
        assertEquals(1, customer.getGarageSize());
        assertEquals(10000.50, dealer.getTill(), 0.000);
        assertEquals(19999.50, customer.getMoney(), 0.000);

    }

    @Test
    public void canGetIntoAnAccident() {
        customer.accident(car);
        assertEquals(9000.00, car.getPrice(), 0.01);
    }




}
