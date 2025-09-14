package Level 1;

public class Employee {


class Employee {
    String name;
    int id;
    double salary;

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(name, id, salary);

        System.out.println("\nEmployee Details:");
        e.display();
    }
}

    
}
