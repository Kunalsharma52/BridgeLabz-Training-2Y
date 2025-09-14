class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String managerLevel;

    Manager(int employeeID, String department, double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Level: " + managerLevel);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 50000);
        e1.displayEmployeeDetails();
        e1.setSalary(55000);
        e1.displayEmployeeDetails();

        Manager m1 = new Manager(201, "HR", 70000, "Senior");
        m1.displayManagerDetails();
    }
}
