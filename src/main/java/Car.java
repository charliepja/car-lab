import components.*;

public class Car {
    private Engine engine;
    private GearBox gears;
    private Frame frame;
    private Wheel wheel;
    private int numberOfWheels;
    private String make;
    private String model;
    private double price;
    private String colour;
    private double damage;

    public Car(Engine engine, GearBox gears, Frame frame, Wheel wheel, int numberOfWheels, String make, String model, double price, String colour, double damage) {
        this.engine = engine;
        this.gears = gears;
        this.frame = frame;
        this.wheel = wheel;
        this.numberOfWheels = numberOfWheels;
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.damage = damage;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public GearBox getGears() {
        return this.gears;
    }

    public Frame getFrame() {
        return this.frame;
    }

    public Wheel getWheel() {
        return this.wheel;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
