class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        displayDetails();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        displayDetails();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        displayDetails();
        System.out.println("Role: Staff, Department: " + department);
    }
}

public class SSDR {
    public static void main(String[] args) {
        Teacher t = new Teacher("Rajesh", 40, "Mathematics");
        Student s = new Student("Kunal", 20, "B.Tech 2nd Year");
        Staff st = new Staff("Anita", 35, "Administration");

        t.displayRole();
        System.out.println("------------------");
        s.displayRole();
        System.out.println("------------------");
        st.displayRole();
    }
}
