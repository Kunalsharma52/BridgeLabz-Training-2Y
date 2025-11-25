class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemTest {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 45000);
        item1.displayDetails();
        System.out.println("Total cost for 2 items: " + item1.calculateTotalCost(2));
    }
}
