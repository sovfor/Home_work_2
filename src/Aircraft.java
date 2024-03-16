public class Aircraft extends Vehicle implements Flyable {
    private int maxAltitude;

    private boolean isFlying;

    private boolean engineIsOn;

    private int speed = 0;

    public Aircraft(int id, String brand, String model, int year, int maxAltitude){
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель запустился.");
        engineIsOn = true;
    }

    @Override
    public void stopEngine() {
        if(isFlying){
        System.out.println("Двигатель выключился, но мы ведь в воздухе... Оно того стоило?");

        }
        else{
            System.out.println("Двигатель остановлен.");
        }
        engineIsOn = false;
        speed = 0;
    }

    @Override
    public void accelerate(int speed) {
        this.speed = speed;
    }

    @Override
    public void brake() {
        if(isFlying){
            System.out.println("Остановится в воздухе на самолёте невозможно");
        }
        else if(speed == 0){
            System.out.println("Не думаю, что можно ещё более остановиться...Мы уже стоим");
        }
        else {
            System.out.println("Самолёт остановился");
            speed = 0;
        }
    }

    public int getSpeed(){
        return speed;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public void takeOff() {
        if(engineIsOn){

        System.out.println("Самолёт взлетает");
        isFlying = true;
        }
        else {
            System.out.println("Взлететь нельзя, пока двигатель выключен.");
        }

    }

    @Override
    public void land() {
        System.out.println("Самолёт приземляется");
        isFlying = false;
    }



    @Override
    public void displayInfo() {
        System.out.println("id самолёта: "  + id);
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Максимальная высота полёта: " + maxAltitude);


    }
}
