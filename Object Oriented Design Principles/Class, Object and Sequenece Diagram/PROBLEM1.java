import java.util.ArrayList;

class Subject {
    private String subjectName;
    private int marks;

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        ArrayList<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) return "No subjects available";

        int total = 0;
        for (Subject s : subjects) {
            total += s.getMarks();
        }

        double average = (double) total / subjects.size();

        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else return "F";
    }
}

class Student {
    private String name;
    private int rollNo;
    private ArrayList<Subject> subjects;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void viewResult(GradeCalculator gc) {
        System.out.println("\nStudent: " + name + " (Roll No: " + rollNo + ")");
        for (Subject s : subjects) {
            System.out.println("Subject: " + s.getSubjectName() + " | Marks: " + s.getMarks());
        }
        String grade = gc.calculateGrade(this);
        System.out.println("Final Grade: " + grade);
    }
}

public class PROBLEM1 {
    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();

        Student s1 = new Student("John", 101);
        s1.addSubject(new Subject("Maths", 90));
        s1.addSubject(new Subject("Science", 85));

        Student s2 = new Student("Alice", 102);
        s2.addSubject(new Subject("Maths", 75));
        s2.addSubject(new Subject("English", 80));

        s1.viewResult(gc);
        s2.viewResult(gc);
    }
}
