public class Car extends Vehicle {
    private int fuelCapacity;

    private int currentFuelLevel = 0;

    private int speed = 0;

    public Car(int id, String brand, String model, int year,int fuelCapacity){

        super(id,  brand,  model, year);
        this.fuelCapacity = fuelCapacity;



    }

    @Override
    public void startEngine() {
        System.out.println("Врум врум.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель выключился.");
    }

    @Override
    public void accelerate(int speed) {
        this.speed = speed;
    }

    @Override
    public void brake() {

        if(speed == 0){
            System.out.println("Не думаю, что можно ещё более остановиться...Мы уже стоим");
        }
        else{
            speed = 0;
            System.out.println("Автомобиль остановился.");
        }
    }

    public void refuel(){
        currentFuelLevel = fuelCapacity;
        System.out.println(" Двигатель заправлен.");
    }

    public int getSpeed(){
        return speed;
    }

    public int getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("id автомобиля: "  + id);
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Ёмкость топливного бака: " + fuelCapacity);
    }
}
