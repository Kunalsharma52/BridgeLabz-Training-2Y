import java.util.*;

class Patient { String id; String name; Patient(String id,String n){this.id=id;this.name=n;} public String toString(){return id+":"+name;} public boolean equals(Object o){return (o instanceof Patient)&&id.equals(((Patient)o).id);} public int hashCode(){return id.hashCode();} }

public class Hospital {
    Set<Patient> admitted = new HashSet<>();
    Queue<Patient> waiting = new LinkedList<>();
    Stack<Patient> discharged = new Stack<>();
    List<Patient> history = new ArrayList<>();

    public void admit(Patient p){
        if(admitted.add(p)){ waiting.add(p); history.add(p); System.out.println("Admitted "+p); } else System.out.println("Already admitted");
    }
    public void treatNext(){
        Patient p = waiting.poll();
        if(p==null) return;
        System.out.println("Treated "+p);
    }
    public void discharge(Patient p){
        if(admitted.remove(p)){ discharged.push(p); System.out.println("Discharged "+p); }
    }
    public void readmitRecent(){
        if(discharged.isEmpty()) return;
        Patient p = discharged.pop();
        admit(p);
    }
    public static void main(String[] args){
        Hospital h=new Hospital();
        Patient p1=new Patient("P1","Alice");
        h.admit(p1);
        h.treatNext();
        h.discharge(p1);
        h.readmitRecent();
    }
}
