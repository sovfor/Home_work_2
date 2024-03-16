public abstract class Vehicle {

    protected int id;
    protected String brand;
    protected String model;
    protected int year;



    public Vehicle(int id, String brand, String model, int year){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public abstract void startEngine();

    public abstract  void stopEngine();

    public abstract  void accelerate(int speed);

    public abstract  void brake();

    public abstract void displayInfo();

}
