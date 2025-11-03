import java.util.ArrayList;

class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + name + ", Subject: " + subject);
    }
}

class Department {
    private String deptName;
    private ArrayList<Faculty> faculties;

    public Department(String deptName) {
        this.deptName = deptName;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartment() {
        System.out.println("\nDepartment: " + deptName);
        if (faculties.isEmpty()) {
            System.out.println("No faculty assigned yet.");
        } else {
            for (Faculty f : faculties) {
                f.showFaculty();
            }
        }
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversity() {
        System.out.println("\nUniversity Name: " + universityName);
        System.out.println("Departments and Faculties:");
        for (Department d : departments) {
            d.showDepartment();
        }
        System.out.println("\nAll Independent Faculties:");
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }

    public void closeUniversity() {
        System.out.println("\nClosing University: " + universityName);
        departments.clear();
        System.out.println("All departments have been deleted (composition).");
    }
}

public class UFD {
    public static void main(String[] args) {
        University uni = new University("Global Tech University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical Engineering");

        Faculty f1 = new Faculty("Alice", "Data Structures");
        Faculty f2 = new Faculty("Bob", "Thermodynamics");
        Faculty f3 = new Faculty("Charlie", "AI and Machine Learning");

        d1.addFaculty(f1);
        d1.addFaculty(f3);
        d2.addFaculty(f2);

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);

        uni.showUniversity();

        uni.closeUniversity();
    }
}
