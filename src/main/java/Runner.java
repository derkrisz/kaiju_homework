import Kaiju.Kumonga;
import Kaiju.Mothra;
import Vehicle.Aircraft;
import Vehicle.Tank;

public class Runner {

    public static void main(String[] args) {

        Mothra mothra = new Mothra("Mothra", 1000, 50);
        Kumonga kumonga = new Kumonga("Kumonga", 900, 40);
        Tank tank = new Tank("K2 Black Panther", 500);
        Aircraft aircraft = new Aircraft("F-22 Raptor", 200);



        System.out.println(tank.getType() + "'s health is " + tank.getHealthValue());
        System.out.println(tank.getType() + " is under attack by " + kumonga.getName() + "!!");
        mothra.attack(tank);
        System.out.println("Damage inflicted");
        System.out.println(tank.getType() + "'s new health is " +tank.getHealthValue());

        System.out.println(aircraft.getType() + "'s health is " + aircraft.getHealthValue());
        System.out.println(kumonga.getName() + " attacks!!");
        kumonga.attack(aircraft);
        System.out.println("Damage successful");
        System.out.println(aircraft.getType() + "'s new health is " +aircraft.getHealthValue());

    }


}
