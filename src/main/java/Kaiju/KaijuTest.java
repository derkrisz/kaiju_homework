package Kaiju;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KaijuTest {

    Kumonga kumonga;
    Mothra mothra;

    @Before
    public void before() {
        kumonga = new Kumonga("Kumonga", 1000, 50);
        mothra = new Mothra("Mothra", 900, 40);

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

}
