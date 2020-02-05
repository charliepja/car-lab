import components.Tyre;
import components.Wheel;
import components.WheelType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelTest {
    private Wheel wheel;
    private Tyre tyre;

    @Before
    public void before() {
        this.tyre = new Tyre(24, "Michelin");
        this.wheel = new Wheel(tyre, 24, WheelType.ALLOY);
    }

    @Test
    public void canGetTyre() {
        assertEquals(tyre, wheel.getTyre());
    }

    @Test
    public void canSetTyre() {
        Tyre tyre2 = new Tyre(25, "Mich");
        wheel.setTyre(tyre2);
        assertEquals(tyre2, wheel.getTyre());
    }

    @Test
    public void canGetSize() {
        assertEquals(24, wheel.getSize());
    }

    @Test
    public void canGetWheelType() {
        assertEquals("ALLOY", wheel.getWheelType());
    }


}
