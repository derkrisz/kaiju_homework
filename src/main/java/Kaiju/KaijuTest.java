package Kaiju;
import org.junit.Before;

public class KaijuTest {

    Kumonga kumonga;
    Mothra mothra;

    @Before
    public void before{
        kumonga = new Kumonga("Kumonga", 1000, 50);
        mothra = new Mothra("Mothra", 900, 40);

    }
}
