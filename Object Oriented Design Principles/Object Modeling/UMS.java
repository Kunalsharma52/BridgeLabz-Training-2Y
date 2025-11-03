import java.util.ArrayList;

class Professor {
    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
        System.out.println("Professor " + name + " assigned to course " + course.getCourseName());
    }

    public void showCourses() {
        System.out.println("\nProfessor: " + name);
        System.out.println("Courses Taught:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in course " + course.getCourseName());
    }

    public void showEnrolledCourses() {
        System.out.println("\nStudent: " + name);
        System.out.println("Enrolled Courses:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null)
            System.out.println("Professor: " + professor.getName());
        else
            System.out.println("No professor assigned yet.");

        System.out.println("Enrolled Students:");
        if (students.isEmpty())
            System.out.println("No students enrolled yet.");
        else
            for (Student s : students)
                System.out.println("- " + s.getName());
    }
}

class University {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + name);
        System.out.println("Courses Offered:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }

        System.out.println("\nProfessors:");
        for (Professor p : professors) {
            System.out.println("- " + p.getName());
        }

        System.out.println("\nStudents:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class UMS {
    public static void main(String[] args) {
        University uni = new University("Tech Valley University");

        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");
        Course c3 = new Course("Database Management");

        uni.addProfessor(prof1);
        uni.addProfessor(prof2);
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addStudent(s3);
        uni.addCourse(c1);
        uni.addCourse(c2);
        uni.addCourse(c3);

        prof1.assignCourse(c1);
        prof1.assignCourse(c3);
        prof2.assignCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);
        s3.enrollCourse(c3);

        uni.showUniversityDetails();

        prof1.showCourses();
        prof2.showCourses();

        s1.showEnrolledCourses();
        s2.showEnrolledCourses();
        s3.showEnrolledCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
        c3.showCourseDetails();
    }
}
