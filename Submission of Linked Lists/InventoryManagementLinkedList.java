class Item {
    int id, qty;
    String name;
    double price;
    Item next;

    Item(int i, String n, int q, double p) {
        id = i;
        name = n;
        qty = q;
        price = p;
    }
}

public class InventoryManagementLinkedList {
    static Item head;

    static void add(int i, String n, int q, double p) {
        Item newNode = new Item(i, n, q, p);
        newNode.next = head;
        head = newNode;
    }

    static double totalValue() {
        double total = 0;
        Item temp = head;

        while (temp != null) {
            total += temp.qty * temp.price;
            temp = temp.next;
        }
        return total;
    }

    public static void main(String[] args) {
        add(1, "Pen", 10, 5);
        add(2, "Book", 5, 50);

        System.out.println("Total Value: " + totalValue());
    }
}