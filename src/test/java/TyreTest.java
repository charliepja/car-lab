import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    private Tyre tyre;

    @Before
    public void before() {
        this.tyre = new Tyre(24, "Michelin");
    }

    @Test
    public void canGetSize() {
        assertEquals(24, tyre.getSize());
    }

    @Test
    public void canGetMake() {
        assertEquals("Michelin", tyre.getMake());
    }
}
