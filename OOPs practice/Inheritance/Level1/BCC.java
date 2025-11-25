class Employee {
    String name;

    Employee(String name) {
        this.name = name;
        System.out.println("Employee constructor called for " + name);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int teamSize) {
        super(name);
        this.teamSize = teamSize;
        System.out.println("Manager constructor called with team size " + teamSize);
    }
}

public class BCC {
    public static void main(String[] args) {
        Manager m = new Manager("Kunal", 10);
    }
}
