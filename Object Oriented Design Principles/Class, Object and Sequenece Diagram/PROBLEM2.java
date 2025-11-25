import java.util.ArrayList;

class Product {
    private String productName;
    private double quantity;
    private double pricePerUnit;

    public Product(String productName, double quantity, double pricePerUnit) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

class Customer {
    private String name;
    private ArrayList<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void viewBill(BillGenerator billGen) {
        System.out.println("\nCustomer: " + name);
        for (Product p : products) {
            System.out.println("Product: " + p.getProductName() +
                               " | Quantity: " + p.getQuantity() +
                               " | Price per unit: $" + p.getPricePerUnit() +
                               " | Total: $" + p.getTotalPrice());
        }
        double total = billGen.generateBill(this);
        System.out.println("Total Bill: $" + total);
    }
}

public class PROBLEM2 {
    public static void main(String[] args) {
        BillGenerator billGen = new BillGenerator();

        Customer c1 = new Customer("Alice");
        c1.addProduct(new Product("Apples", 2, 3));
        c1.addProduct(new Product("Milk", 1, 2));

        Customer c2 = new Customer("Bob");
        c2.addProduct(new Product("Bread", 1, 1.5));
        c2.addProduct(new Product("Eggs", 12, 0.2));

        c1.viewBill(billGen);
        c2.viewBill(billGen);
    }
}
