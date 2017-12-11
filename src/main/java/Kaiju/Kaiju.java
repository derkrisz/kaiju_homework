package Kaiju;

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

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
