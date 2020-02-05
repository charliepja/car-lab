package components;

public class Tyre {
    private int size;
    private String make;

    public Tyre(int size, String make) {
        this.size = size;
        this.make = make;
    }

    public int getSize() {
        return this.size;
    }

    public String getMake() {
        return this.make;
    }
}
