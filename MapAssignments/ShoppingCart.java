import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();

        cart.put("Shoes", 2);
        cart.put("Tshirt", 1);
        cart.put("Watch", 1);

        cart.put("Shoes", cart.get("Shoes") + 1);

        cart.remove("Watch");

        for (String item : cart.keySet())
            System.out.println(item + " = " + cart.get(item));
    }
}
