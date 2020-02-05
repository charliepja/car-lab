import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GarageTest {
    private Garage garage;
    private Car car;

    @Before
    public void before() {
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
        double damage = 0.00;
        this.car = new Car(engine, gears, frame, wheel, numberOfWheels, make, model, price, colour, damage);
        this.garage = new Garage();
    }

    @Test
    public void garageIsZero() {
        assertEquals(0, garage.getAllCars().size());
    }

    @Test
    public void canAddCar() {
        garage.addCar(car);
        assertEquals(car, garage.getCar(car));
    }

    @Test
    public void canRemoveCar() {
        garage.addCar(car);
        garage.removeCar(car);
        assertEquals(0, garage.getAllCars().size());
    }
}
