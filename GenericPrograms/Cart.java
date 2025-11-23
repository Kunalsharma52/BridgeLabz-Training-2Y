import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() {
        items.forEach(i -> System.out.println(i.getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        class Electronics {}
        class Clothing {}

        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());
        eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());
        cCart.displayItems();
    }
}
