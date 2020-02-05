import components.Frame;
import components.FrameType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrameTest {

    private Frame frame;

    @Before
    public void before() {
        frame = new Frame(5, FrameType.SUV);
    }

    @Test
    public void canGetDoors() {
        assertEquals(5, frame.getDoors());
    }

    @Test
    public void canGetFrameType() {
        assertEquals(FrameType.SUV, frame.getFrameType());
    }
}
