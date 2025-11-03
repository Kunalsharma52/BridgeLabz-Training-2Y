class Vehicle implements Cloneable {
    String model;
    String color;

    Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
            return null;
        }
    }
}

public class CPO {
    public static void main(String[] args) {
        Vehicle original = new Vehicle("Tesla Model S", "Red");
        Vehicle copy = original.clone();

        System.out.println("Original Vehicle: " + original.model + " - " + original.color);
        System.out.println("Cloned Vehicle: " + copy.model + " - " + copy.color);
    }
}
