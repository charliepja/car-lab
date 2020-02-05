import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Engine engine;
    private Tyre tyre;
    private GearBox gears;
    private Frame frame;
    private Wheel wheel;
    private int numberOfWheels;
    private String make;
    private String model;
    private double price;
    private String colour;
    private double damage;
    private Car car;

    @Before
    public void before() {
        engine = new Engine(1200, 35, FuelType.ELECTRIC);
        tyre = new Tyre(24, "Michelin");
        gears = new GearBox(GearBoxType.AUTOMATIC);
        frame = new Frame(5, FrameType.SUV);
        wheel = new Wheel(tyre, 24, WheelType.ALLOY);
        numberOfWheels = 4;
        make = "Ford";
        model = "Fiesta";
        price = 10000.50;
        colour = "Blue";
        damage = 0.00;
        car = new Car(engine, gears, frame, wheel, numberOfWheels, make, model, price, colour, damage);
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canGetWheel() {
        assertEquals(wheel, car.getWheel());
    }

    @Test
    public void canGetGears() {
        assertEquals(gears, car.getGears());
    }

    @Test
    public void canGetNumberOfWheels() {
        assertEquals(4, car.getNumberOfWheels());
    }

    @Test
    public void canGetMake() {
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Fiesta", car.getModel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(10000.50, car.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice() {
        car.setPrice(5000.50);
        assertEquals(5000.50, car.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void canGetDamage() {
        assertEquals(0.00, car.getDamage(), 0.01);
    }

    @Test
    public void canSetDamage() {
        car.setDamage(5.00);
        assertEquals(5.00, car.getDamage(), 0.01);
    }
}
