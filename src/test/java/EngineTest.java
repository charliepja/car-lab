import components.Engine;
import components.FuelType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(1200, 35, FuelType.ELECTRIC);
    }

    @Test
    public void canGetFuelCapacity() {
        assertEquals(1200, engine.getFuelCapacity());
    }

    @Test
    public void canGetHorsePower() {
        assertEquals(35, engine.getHorsePower());
    }

    @Test
    public void canGetFuelType() {
        assertEquals(FuelType.ELECTRIC, engine.getFuelType());
    }

}
