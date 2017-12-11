package Kaiju;

import Vehicle.Vehicle;

public class Kumonga extends Kaiju implements Ikaijus {
    public Kumonga(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String walk() {
        return "*scurry scurry*";
    }

    public void attack(Vehicle vehicle) {
        int damage = vehicle.getHealthValue()-attackValue;
        vehicle.setHealthValue(damage);

    }
}
