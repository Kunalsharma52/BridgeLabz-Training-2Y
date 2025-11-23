import java.util.*;

class Student { String id; int marks; Student(String id,int m){this.id=id;this.marks=m;} public String toString(){return id+":"+marks;} public boolean equals(Object o){return (o instanceof Student)&&id.equals(((Student)o).id);} public int hashCode(){return id.hashCode();} }
public class Admission {
    List<Student> applicants = new ArrayList<>();
    Set<Student> shortlisted = new HashSet<>();
    Queue<Student> interviewQueue = new LinkedList<>();
    TreeSet<Student> merit = new TreeSet<>( (a,b)-> b.marks!=a.marks? b.marks-a.marks : a.id.compareTo(b.id) );

    public void apply(Student s){ applicants.add(s); }
    public void shortlistEligible(int minMarks){
        for(Student s: applicants) if(s.marks>=minMarks){ shortlisted.add(s); interviewQueue.add(s); }
    }
    public void processInterviews(){
        while(!interviewQueue.isEmpty()){
            Student s = interviewQueue.poll();
            System.out.println("Interviewed "+s);
            // assume interview passes if marks>50
            if(s.marks>50) merit.add(s);
        }
    }
    public static void main(String[] args){
        Admission a = new Admission();
        a.apply(new Student("S1",60)); a.apply(new Student("S2",45)); a.apply(new Student("S3",75));
        a.shortlistEligible(40);
        a.processInterviews();
        System.out.println("Merit list: "+a.merit);
    }
}
