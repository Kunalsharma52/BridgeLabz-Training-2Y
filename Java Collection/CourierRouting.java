import java.util.*;

class Parcel { String id; int priority; Parcel(String id,int p){this.id=id;this.priority=p;} public String toString(){return id+"(p"+priority+")";} }

public class CourierRouting {
    PriorityQueue<Parcel> pq = new PriorityQueue<>( (a,b)-> Integer.compare(b.priority,a.priority) );
    Set<String> assigned = new HashSet<>();
    List<Parcel> completed = new ArrayList<>();
    Queue<Parcel> normal = new LinkedList<>();

    public void addParcel(Parcel p){ pq.add(p); normal.add(p); }
    public void assignNext(){
        Parcel p = pq.poll();
        if(p==null) return;
        if(assigned.add(p.id)){ completed.add(p); System.out.println("Assigned "+p); } else System.out.println("Already assigned "+p.id);
    }
    public static void main(String[] args){
        CourierRouting c = new CourierRouting();
        c.addParcel(new Parcel("X1",5));
        c.addParcel(new Parcel("X2",1));
        c.assignNext();
        c.assignNext();
    }
}
