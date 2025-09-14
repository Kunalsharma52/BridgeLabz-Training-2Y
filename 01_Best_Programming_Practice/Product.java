class Product {
    static double discount = 10.0;
    final String productID;
    String productName;
    double price;
    int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        if(this instanceof Product) {
            System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 1200, 2);
        p1.displayDetails();
        Product.updateDiscount(15.0);
        p1.displayDetails();
    }
}
