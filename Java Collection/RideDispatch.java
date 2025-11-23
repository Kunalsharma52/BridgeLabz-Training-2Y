import java.util.*;

class RideRequest {
    String id; int priority; // smaller -> higher priority (distance)
    public RideRequest(String id,int p){this.id=id;this.priority=p;}
    public String toString(){return id+"(p="+priority+")";}
}
class Driver { String id; public Driver(String id){this.id=id;} public String toString(){return id;} }

public class RideDispatch {
    Queue<RideRequest> pending = new LinkedList<>();
    Set<Driver> available = new HashSet<>();
    List<String> completed = new ArrayList<>();
    PriorityQueue<RideRequest> pq = new PriorityQueue<>(Comparator.comparingInt(r->r.priority));

    public void addRequest(RideRequest r){ pending.add(r); pq.add(r); }
    public void addDriver(Driver d){ available.add(d); }
    public void assignNext(){
        RideRequest r = pq.poll();
        if(r==null){ System.out.println("No high-pr requests"); return; }
        if(available.isEmpty()){ System.out.println("No drivers for "+r); return; }
        Driver d = available.iterator().next();
        available.remove(d);
        System.out.println("Assigned "+d+" to "+r);
        completed.add(r.id+"->"+d.id);
    }
    public static void main(String[] args){
        RideDispatch rd = new RideDispatch();
        rd.addDriver(new Driver("D1"));
        rd.addDriver(new Driver("D2"));
        rd.addRequest(new RideRequest("R1",10));
        rd.addRequest(new RideRequest("R2",5));
        rd.assignNext(); // assigns R2 first
        rd.assignNext();
        System.out.println("Completed: "+rd.completed);
    }
}
