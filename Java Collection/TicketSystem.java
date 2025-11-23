import java.util.*;

class Booking { String id; String user; boolean vip; Booking(String id,String user,boolean vip){this.id=id;this.user=user;this.vip=vip;} public String toString(){return id+":"+user+(vip?"(VIP)":"");} }

public class TicketSystem {
    List<Booking> all = new ArrayList<>();
    Set<String> users = new HashSet<>();
    Queue<Booking> queue = new LinkedList<>();
    PriorityQueue<Booking> vip = new PriorityQueue<>( (a,b)-> Boolean.compare(b.vip,a.vip) );

    public void registerUser(String user){
        if(!users.add(user)) System.out.println("User exists: "+user);
    }
    public void addBooking(Booking b){
        all.add(b);
        if(b.vip) vip.add(b); else queue.add(b);
    }
    public void processNext(){
        Booking b = vip.isEmpty() ? queue.poll() : vip.poll();
        if(b!=null) System.out.println("Confirmed "+b);
    }
    public static void main(String[] args){
        TicketSystem t = new TicketSystem();
        t.registerUser("u1"); t.registerUser("u1");
        t.addBooking(new Booking("B1","u1",false));
        t.addBooking(new Booking("B2","u2",true));
        t.processNext(); t.processNext();
    }
}
