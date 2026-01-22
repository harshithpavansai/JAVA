public class Car {
    String make;
    String model;
    int year;
    boolean isStarted;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isStarted = false;
        System.out.println("A " + year + " " + make + " " + model + " has been created.");
    }

    public void startEngine() {
        if (isStarted) {
            System.out.println("The " + model + "'s engine is already running.");
        } else {
            isStarted = true;
            System.out.println("Vroom! The " + model + "'s engine has started.");
        }
    }

    public void stopEngine() {
        if (!isStarted) {
            System.out.println("The " + model + "'s engine is already off.");
        } else {
            isStarted = false;
            System.out.println("The " + model + "'s engine has stopped.");
        }
    }

    public void displayInfo() {
        System.out.println("--- Car Details ---");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Engine running: " + this.isStarted);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Car myTesla = new Car("Tesla", "Model 3", 2024);
        myTesla.displayInfo();
        myTesla.startEngine();
        myTesla.startEngine();
        myTesla.displayInfo();
        myTesla.stopEngine();
        myTesla.displayInfo();
    }
}
