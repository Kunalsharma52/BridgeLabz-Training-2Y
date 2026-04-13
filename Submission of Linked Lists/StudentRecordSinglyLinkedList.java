class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;

    Student(int r, String n, int a, String g) {
        roll = r;
        name = n;
        age = a;
        grade = g;
    }
}

public class StudentRecordSinglyLinkedList {
    static Student head;

    static void add(int r, String n, int a, String g) {
        Student newNode = new Student(r, n, a, g);

        if (head == null) {
            head = newNode;
            return;
        }

        Student temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    static void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        add(1, "Kunal", 20, "A");
        add(2, "Rahul", 21, "B");
        display();
    }
}