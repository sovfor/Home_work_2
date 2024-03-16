public class  Boat extends Vehicle implements Swimmable {
    private int maxSpeed;

    private boolean engineIsOn;
    private int speed = 0;
    private boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель включился.");
        engineIsOn = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель выключился.");
        speed = 0;
        engineIsOn = false;
    }

    @Override
    public void accelerate(int speed) {
        if(speed > maxSpeed){
            System.out.println("Введённая скорость выше максимальной");
        }
        else{
            this.speed = speed;
        }
    }

    @Override
    public void brake() {

        if (speed == 0) {
            System.out.println("Не думаю, что можно ещё более остановиться...Мы уже стоим");
        } else {
            speed = 0;
            System.out.println("Корабль остановился.");
        }
    }

    @Override
    public void startSwimming() {
        if(engineIsOn) {
            System.out.println("Корабль отчалил.");
        }
        else {
            System.out.println("Отплыть нельзя, пока двигатель выключен.");
        }
    }

    @Override
    public void stopSwimming() {
        System.out.println("Корабль причалил.");
        speed = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("id коробля: "  + id);
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Максимальная скорость корабля " + maxSpeed);


    }
}
