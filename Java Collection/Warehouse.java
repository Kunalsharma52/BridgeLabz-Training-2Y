import java.util.*;

class Parcel { String id; String address; Parcel(String id,String addr){this.id=id;this.address=addr;} public String toString(){return id;} }

public class Warehouse {
    Queue<Parcel> pending = new LinkedList<>();
    Set<String> ids = new HashSet<>();
    List<Parcel> delivered = new ArrayList<>();
    Stack<Parcel> returned = new Stack<>();

    public void addParcel(Parcel p){
        if(ids.add(p.id)) pending.add(p); else System.out.println("Duplicate parcel "+p.id);
    }
    public void processNext(){
        Parcel p = pending.poll();
        if(p==null) return;
        delivered.add(p);
        System.out.println("Delivered "+p);
    }
    public void returnParcel(Parcel p){
        returned.push(p);
    }
    public static void main(String[] args){
        Warehouse w = new Warehouse();
        w.addParcel(new Parcel("P1","Addr1"));
        w.addParcel(new Parcel("P2","Addr2"));
        w.addParcel(new Parcel("P1","Addr1")); // dup
        w.processNext();
        w.processNext();
        System.out.println("Delivered: "+w.delivered);
    }
}
