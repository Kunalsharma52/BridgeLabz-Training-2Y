import java.util.*;

abstract class WarehouseItem {}
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
    public List<T> getItems() { return items; }
}

class WarehouseDemo {
    public static void displayAll(List<? extends WarehouseItem> list) {
        list.forEach(i -> System.out.println(i.getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        Storage<Electronics> e = new Storage<>();
        e.add(new Electronics());

        displayAll(e.getItems());
    }
}
