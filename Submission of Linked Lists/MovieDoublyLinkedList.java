class Movie {
    String title;
    int year;
    double rating;
    Movie next, prev;

    Movie(String t, int y, double r) {
        title = t;
        year = y;
        rating = r;
    }
}

public class MovieDoublyLinkedList {
    static Movie head, tail;

    static void addEnd(String t, int y, double r) {
        Movie newNode = new Movie(t, y, r);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    static void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addEnd("Inception", 2010, 9.0);
        addEnd("Avatar", 2009, 8.5);
        displayForward();
    }
}