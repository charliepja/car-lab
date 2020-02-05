package components;

public class Frame {
    private int doors;
    private FrameType frameType;

    public Frame(int doors, FrameType frameType) {
        this.doors = doors;
        this.frameType = frameType;
    }

    public int getDoors() {
        return this.doors;
    }

    public FrameType getFrameType() {
        return this.frameType;
    }
}
