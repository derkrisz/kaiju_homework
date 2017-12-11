package Kaiju;

public class Kumonga extends Kaiju {
    public Kumonga(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String walk() {
        return "*scurry scurry*";
    }
}
