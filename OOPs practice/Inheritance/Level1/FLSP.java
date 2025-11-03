class Bird {
    void fly() {
        System.out.println("This bird can fly.");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies swiftly.");
    }
}

public class FLSP {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
    }
}
