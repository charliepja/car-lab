package components;

public class GearBox {
    private GearBoxType gearBox;

    public GearBox(GearBoxType gearBox) {
        this.gearBox = gearBox;
    }

    public String getGearBox() {
        return this.gearBox.getType();
    }

    public int getNumberOfGears() {
        return this.gearBox.getGears();
    }
}
