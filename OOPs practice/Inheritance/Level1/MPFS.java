class Vehicle {
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle {
    public Car(String model, int speed) {
        super(model, speed);
    }

    void displayInfo() {
        System.out.println("Car Model: " + getModel() + ", Speed: " + getSpeed());
    }
}

public class MPFS {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 120);
        car.displayInfo();
        car.setSpeed(150);
        car.displayInfo();
    }
}
