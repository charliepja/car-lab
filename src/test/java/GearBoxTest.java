import components.GearBox;
import components.GearBoxType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {
    private GearBox gearBox;

    @Before
    public void before() {
        this.gearBox = new GearBox(GearBoxType.AUTOMATIC);
    }

    @Test
    public void canGetType() {
        assertEquals("AUTOMATIC", gearBox.getGearBox());
    }

    @Test
    public void canGetNumberOfGears() {
        assertEquals(4, gearBox.getNumberOfGears());
    }
}
