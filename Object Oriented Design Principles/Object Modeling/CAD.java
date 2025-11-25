import java.util.ArrayList;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void showEmployee() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    public void showDepartment() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showCompany() {
        System.out.println("\nCompany Name: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }

    public void closeCompany() {
        System.out.println("\nClosing company: " + companyName);
        departments.clear();
        System.out.println("All departments and employees have been removed.");
    }
}

public class CAD {
    public static void main(String[] args) {
        Company comp = new Company("Tech Innovators Pvt. Ltd.");

        Department d1 = new Department("Research and Development");
        d1.addEmployee("Alice", "R&D Engineer");
        d1.addEmployee("Bob", "Research Analyst");

        Department d2 = new Department("Human Resources");
        d2.addEmployee("Charlie", "HR Manager");
        d2.addEmployee("Daisy", "Recruiter");

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();

        comp.closeCompany();
    }
}
