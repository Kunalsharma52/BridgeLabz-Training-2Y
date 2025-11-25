import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            System.out.println("Product: " + p.getName() + " | Price: " + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: " + total);
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order);
    }

    public void viewOrders() {
        System.out.println("\nCustomer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

class ECommercePlatform {
    private String platformName;
    private ArrayList<Customer> customers;

    public ECommercePlatform(String platformName) {
        this.platformName = platformName;
        this.customers = new ArrayList<>();
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void showCustomers() {
        System.out.println("\nE-Commerce Platform: " + platformName);
        System.out.println("Registered Customers:");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}

public class EPECP {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform("ShopEase");

        Product p1 = new Product("Laptop", 75000.0);
        Product p2 = new Product("Smartphone", 25000.0);
        Product p3 = new Product("Headphones", 3000.0);
        Product p4 = new Product("Keyboard", 1500.0);

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        platform.registerCustomer(c1);
        platform.registerCustomer(c2);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = new Order(102);
        o2.addProduct(p2);
        o2.addProduct(p4);

        c1.placeOrder(o1);
        c2.placeOrder(o2);

        platform.showCustomers();

        c1.viewOrders();
        c2.viewOrders();
    }
}
