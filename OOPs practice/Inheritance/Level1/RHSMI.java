interface Worker {
    void performDuties();
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Preparing dishes in specialty: " + specialty);
    }
}

class Waiter extends Person implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Serving " + tableCount + " tables.");
    }
}

public class RHSMI {
    public static void main(String[] args) {
        Chef chef = new Chef("Ramesh", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Suresh", 102, 5);

        chef.displayDetails();
        chef.performDuties();
        System.out.println("------------------");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
