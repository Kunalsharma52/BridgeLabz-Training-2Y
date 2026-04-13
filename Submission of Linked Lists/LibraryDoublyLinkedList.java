class Book {
    int id;
    String title;
    Book next, prev;

    Book(int i, String t) {
        id = i;
        title = t;
    }
}

public class LibraryDoublyLinkedList {
    static Book head;

    static void add(int id, String title) {
        Book newNode = new Book(id, title);

        if (head != null)
            head.prev = newNode;

        newNode.next = head;
        head = newNode;
    }

    static int count() {
        int c = 0;
        Book temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void main(String[] args) {
        add(1, "DSA");
        add(2, "Java");

        System.out.println("Total Books: " + count());
    }
}