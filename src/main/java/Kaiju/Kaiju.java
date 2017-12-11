package Kaiju;

import Vehicle.Vehicle;

public abstract class Kaiju {

    private String name;
    protected int healthValue;
    protected int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return healthValue;
    }

    public int getAttack() {
        return attackValue;
    }

    public String roar() {
        return "Roooar!";
    }

}
