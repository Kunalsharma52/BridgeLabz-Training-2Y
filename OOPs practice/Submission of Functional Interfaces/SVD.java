interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery information not available for this vehicle.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 100 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery level: 85%");
    }
}

public class SVD {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
