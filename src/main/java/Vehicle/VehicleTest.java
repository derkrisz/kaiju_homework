package Vehicle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Tank tank;
    Aircraft aircraft;

    @Before
    public void before() {
        tank = new Tank("K2 Black Panther", 500);
        aircraft = new Aircraft("F-22 Raptor", 200);
    }

    @Test
    public void hasName() {
        assertEquals("K2 Black Panther", tank.getType());
        assertEquals("F-22 Raptor", aircraft.getType());
    }

    @Test
    public void hasHealth() {
        assertEquals(500, tank.getHealthValue());
        assertEquals(200, aircraft.getHealthValue());
    }
}
