import java.util.*;

class Product {
    private double price;
    public Product(double price) { this.price = price; }
    public double getPrice() { return price; }
}

class Mobile extends Product {
    public Mobile(double p) { super(p); }
}

class Laptop extends Product {
    public Laptop(double p) { super(p); }
}

class Product1 {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for(Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> m = List.of(new Mobile(20000), new Mobile(15000));
        List<Laptop> l = List.of(new Laptop(50000));

        System.out.println(calculateTotal(m));
        System.out.println(calculateTotal(l));
    }
}
