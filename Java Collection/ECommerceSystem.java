import java.util.*;

class Order {
    String id;
    String customer;
    double amount;
    public Order(String id, String customer, double amount){
        this.id=id; this.customer=customer; this.amount=amount;
    }
    @Override public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Order)) return false;
        return id.equals(((Order)o).id);
    }
    @Override public int hashCode(){ return id.hashCode(); }
    @Override public String toString(){ return id+":"+customer+":"+amount; }
}

public class ECommerceSystem {
    List<Order> allOrders = new ArrayList<>();
    Set<Order> uniqueOrders = new HashSet<>();
    Queue<Order> processingQueue = new LinkedList<>();
    Stack<Order> failedStack = new Stack<>();

    public void addOrder(Order o){
        allOrders.add(o);
    }
    public void removeDuplicates(){
        uniqueOrders.clear();
        uniqueOrders.addAll(allOrders);
    }
    public void prepareProcessingQueue(){
        processingQueue.clear();
        processingQueue.addAll(uniqueOrders);
    }
    public void processAll(){
        while(!processingQueue.isEmpty()){
            Order o = processingQueue.poll();
            boolean success = processOrder(o);
            if(!success) failedStack.push(o);
        }
    }
    private boolean processOrder(Order o){
        // simulate: orders with odd id hash fail
        boolean ok = o.id.hashCode()%2==0;
        System.out.println("Processing "+o+" => "+(ok?"OK":"FAIL"));
        return ok;
    }
    public void reprocessFailed(){
        while(!failedStack.isEmpty()){
            Order o = failedStack.pop();
            System.out.println("Retrying "+o);
            processOrder(o);
        }
    }
    public static void main(String[] args){
        ECommerceSystem sys = new ECommerceSystem();
        sys.addOrder(new Order("O1","Alice",100));
        sys.addOrder(new Order("O2","Bob",200));
        sys.addOrder(new Order("O1","Alice",100)); // duplicate
        sys.addOrder(new Order("O3","Carol",150));

        sys.removeDuplicates();
        System.out.println("Unique orders: "+sys.uniqueOrders);
        sys.prepareProcessingQueue();
        sys.processAll();
        sys.reprocessFailed();
    }
}
