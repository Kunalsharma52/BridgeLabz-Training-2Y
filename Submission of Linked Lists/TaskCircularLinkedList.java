class Task {
    int id;
    String name;
    Task next;

    Task(int i, String n) {
        id = i;
        name = n;
    }
}

public class TaskCircularLinkedList {
    static Task head;

    static void add(int id, String name) {
        Task newNode = new Task(id, name);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Task temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    static void display() {
        Task temp = head;
        if (temp == null) return;

        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        add(1, "Task1");
        add(2, "Task2");
        display();
    }
}