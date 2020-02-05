package components;

public class Wheel {

    private Tyre tyre;
    private int size;
    private WheelType wheelType;

    public Wheel(Tyre tyre, int size, WheelType wheel) {
        this.tyre = tyre;
        this.size = size;
        this.wheelType = wheel;
    }

    public Tyre getTyre() {
        return this.tyre;
    }

    public int getSize() {
        return this.size;
    }

    public String getWheelType() {
        return this.wheelType.getType();
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
