import java.util.*;

class Question { String id, text; public Question(String id,String t){this.id=id;this.text=t;} public String toString(){return id+":"+text;} }
class Student{ String id; public Student(String id){this.id=id;} public String toString(){return id;} }

public class OnlineExam {
    List<Question> questionPool = new ArrayList<>();
    Set<String> studentIds = new HashSet<>();
    Queue<Student> waitingQueue = new LinkedList<>();

    public void addQuestion(Question q){ questionPool.add(q); }
    public void enrollStudent(String sid){
        if(studentIds.add(sid)) waitingQueue.add(new Student(sid));
        else System.out.println("Duplicate student: "+sid);
    }
    public void serveNextStudent(){
        Student s = waitingQueue.poll();
        if(s==null) { System.out.println("No students waiting"); return; }
        System.out.println("Serving "+s);
    }
    public void randomizeQuestions(){
        Collections.shuffle(questionPool);
    }
    // navigation: push/pop questions
    public static void main(String[] args){
        OnlineExam ex = new OnlineExam();
        ex.addQuestion(new Question("Q1","2+2?"));
        ex.addQuestion(new Question("Q2","Capital of India?"));
        ex.enrollStudent("stu1");
        ex.enrollStudent("stu2");
        ex.enrollStudent("stu1"); // duplicate
        ex.randomizeQuestions();
        System.out.println("Questions: "+ex.questionPool);
        ex.serveNextStudent();
        ex.serveNextStudent();
        ex.serveNextStudent();
        // navigation demo using stack
        Stack<Question> nav = new Stack<>();
        nav.push(ex.questionPool.get(0));
        nav.push(ex.questionPool.get(1));
        System.out.println("Current: "+nav.peek());
        nav.pop();
        System.out.println("Back to: "+nav.peek());
    }
}
