class Employee {
    static String companyName = "Tech Corp";
    private static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails() {
        if(this instanceof Employee) {
            System.out.println("Company: " + companyName + ", ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", "Developer");
        Employee e2 = new Employee(102, "Bob", "Manager");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
