package Vehicle;

public abstract class Vehicle {

    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }
}
