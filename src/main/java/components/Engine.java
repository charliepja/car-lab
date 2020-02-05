package components;

public class Engine {
    private final int fuelCapacity;
    private final int horsePower;
    private final FuelType fuelType;

    public Engine(int fuelCapacity, int horsePower, FuelType fuelType) {
        this.fuelCapacity = fuelCapacity;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public int getFuelCapacity() {
        return this.fuelCapacity;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }
}
