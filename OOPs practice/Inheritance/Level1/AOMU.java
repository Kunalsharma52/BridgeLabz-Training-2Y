class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Car is playing music");
    }
}

public class AOMU {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.playMusic();
    }
}
