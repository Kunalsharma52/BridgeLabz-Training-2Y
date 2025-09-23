class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }
}

public class ShoppingCartTest {
    public static void main(String[] args) {
        CartItem item = new CartItem("Shoes", 1500, 2);
        item.displayCart();
        item.addItem(1);
        item.displayCart();
        item.removeItem(2);
        item.displayCart();
    }
}
