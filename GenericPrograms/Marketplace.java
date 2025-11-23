abstract class Category {}
class BookCategory extends Category {}
class ClothingCategory extends Category {}

class Product<T extends Category> {
    private double price;
    private T category;

    public Product(double price, T category) {
        this.price = price;
        this.category = category;
    }

    public double getPrice() { return price; }
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T p, double percent) {
        System.out.println("Discount applied: " + percent + "%");
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>(500, new BookCategory());
        applyDiscount(book, 10);
    }
}
