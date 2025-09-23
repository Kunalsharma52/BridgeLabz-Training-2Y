class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 80000);
        phone1.displayDetails();
    }
}
