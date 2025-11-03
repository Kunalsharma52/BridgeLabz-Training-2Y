class Engine {
    void start() {
        System.out.println("Engine starts...");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}

public class FCOI {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
