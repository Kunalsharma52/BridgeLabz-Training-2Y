import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void viewCourses() {
        System.out.println("\nStudent: " + name);
        System.out.println("Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("\nSchool Name: " + schoolName);
        System.out.println("Students Enrolled:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class SSC {
    public static void main(String[] args) {
        School school = new School("Greenwood International School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("Computer Science");

        s1.enrollCourse(c1);
        s1.enrollCourse(c3);

        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        s3.enrollCourse(c2);

        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();
        s3.viewCourses();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        c3.showEnrolledStudents();
    }
}
