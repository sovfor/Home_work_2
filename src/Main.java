//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car(0,"Lada","Kalina",2007,100);

        car.startEngine();
        car.accelerate(100);
        car.brake();
        car.stopEngine();
        System .out.println("");
        car.displayInfo();
        System .out.println("");

        Aircraft aircraft = new Aircraft(0,"Transport","Aircraft",2000,8000);
        aircraft.startEngine();
        aircraft.accelerate(150);
        aircraft.takeOff();
        aircraft.land();
        aircraft.stopEngine();
        System .out.println("");
        aircraft.displayInfo();

        System .out.println("");
        Boat boat = new Boat(0,"Speedboat","Boat",2001,100);
        boat.startEngine();
        boat.accelerate(100);
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopEngine();
        System .out.println("");
        boat.displayInfo();



    }
}