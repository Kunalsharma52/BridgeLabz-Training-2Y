class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery charging");
    }
}

public class ADIH {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.startEngine();
        e.chargeBattery();
        e.move();
    }
}
