import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        stock.put("Apple", 20);
        stock.put("Milk", 10);
        stock.put("Bread", 15);
        stock.put("Eggs", 30);

        stock.put("Apple", stock.get("Apple") - 5);
        stock.put("Milk", stock.get("Milk") - 10);
        stock.put("Bread", stock.get("Bread") - 15);

        if (stock.get("Milk") <= 0) stock.put("Milk", 0);
        if (stock.get("Bread") <= 0) stock.put("Bread", 0);

        stock.put("Eggs", stock.get("Eggs") + 20);

        String query = "Apple";
        if (stock.containsKey(query))
            System.out.println(query + " Remaining: " + stock.get(query));
        else
            System.out.println(query + " not stocked");

        System.out.println("\nOut of Stock Products:");
        for (String p : stock.keySet()) {
            if (stock.get(p) == 0) {
                System.out.println(p);
            }
        }

        System.out.println("\nFinal Stock:");
        for (String p : stock.keySet()) {
            System.out.println(p + " = " + stock.get(p));
        }
    }
}
