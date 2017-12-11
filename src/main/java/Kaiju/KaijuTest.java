package Kaiju;
import Vehicle.Aircraft;
import Vehicle.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Kumonga kumonga;
    Mothra mothra;
    Tank tank;
    Aircraft aircraft;

    @Before
    public void before() {
        kumonga = new Kumonga("Kumonga", 1000, 50);
        mothra = new Mothra("Mothra", 900, 40);
        tank = new Tank("K2 Black Panther", 500);
        aircraft = new Aircraft("F-22 Raptor", 200);

    }

    @Test
    public void hasName() {
        assertEquals("Kumonga", kumonga.getName());
        assertEquals("Mothra", mothra.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(1000, kumonga.getHealth());
        assertEquals(900, mothra.getHealth());
    }

    @Test
    public void hasAttack() {
        assertEquals(50, kumonga.getAttack());
        assertEquals(40, mothra.getAttack());
    }

    @Test
    public void kumongaCanWalk() {
        assertEquals("*scurry scurry*", kumonga.walk());
    }

    @Test
    public void MothraCanFly() {
        assertEquals("whoosh whoosh", mothra.walk());

    }

    @Test
    public void KaijusCanRoar() {
        assertEquals("Roooar!", kumonga.roar());
        assertEquals("Roooar!", mothra.roar());
    }

    @Test
    public void kumongaCanAttack() {
        kumonga.attack(tank);
        kumonga.attack(aircraft);
        assertEquals(450, tank.getHealthValue());
        assertEquals(150, aircraft.getHealthValue());

    }

    @Test
    public void mothraCanAttack() {
        mothra.attack(tank);
        mothra.attack(aircraft);
        assertEquals(460, tank.getHealthValue());
        assertEquals(160, aircraft.getHealthValue());
    }

}
