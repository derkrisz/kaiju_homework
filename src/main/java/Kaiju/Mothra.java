package Kaiju;

import Vehicle.Vehicle;

public class Mothra extends Kaiju implements Ikaijus {
    public Mothra(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String walk() {
        return "whoosh whoosh";
    }

    public void attack(Vehicle vehicle) {
        int damage = vehicle.getHealthValue()-attackValue;
        vehicle.setHealthValue(damage);

    }
}
