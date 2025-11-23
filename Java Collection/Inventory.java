import java.util.*;

class Product { String name; double price; int stock; Product(String n,double p,int s){name=n;price=p;stock=s;} public String toString(){return name+":"+stock;} }

public class Inventory {
    Set<String> names = new HashSet<>();
    List<Product> catalog = new ArrayList<>();
    Queue<Product> restockQueue = new LinkedList<>();
    Stack<Product> restocked = new Stack<>();

    public void addProduct(Product p){
        if(names.add(p.name)){ catalog.add(p); } else System.out.println("Duplicate product "+p.name);
    }
    public void checkLowStock(int threshold){
        restockQueue.clear();
        for(Product p: catalog) if(p.stock < threshold) restockQueue.add(p);
    }
    public void processRestock(){
        while(!restockQueue.isEmpty()){
            Product p = restockQueue.poll();
            p.stock += 50; restocked.push(p);
            System.out.println("Restocked "+p);
        }
    }
    public void undoLastRestock(){
        if(restocked.isEmpty()) return;
        Product p = restocked.pop(); p.stock -= 50; System.out.println("Undo restock "+p);
    }
    public static void main(String[] args){
        Inventory inv = new Inventory();
        inv.addProduct(new Product("Milk",40,5));
        inv.addProduct(new Product("Bread",20,2));
        inv.addProduct(new Product("Milk",40,5)); // dup
        inv.checkLowStock(10);
        inv.processRestock();
        inv.undoLastRestock();
    }
}
