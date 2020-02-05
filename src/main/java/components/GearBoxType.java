package components;

public enum GearBoxType {
    MANUAL(7),
    AUTOMATIC(4),
    SEMI(8);

    private final int gears;

    GearBoxType(int gears){
        this.gears = gears;
    }

    public int getGears() {
        return this.gears;
    }

    public String getType() {
        return this.name();
    }
}
