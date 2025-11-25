import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {

        Map<String, String> books = new HashMap<>();

        books.put("978-1111111111", "Java Programming");
        books.put("978-2222222222", "Data Structures");
        books.put("978-3333333333", "Operating Systems");
        books.put("978-4444444444", "Computer Networks");

        String searchISBN = "978-2222222222";
        if (books.containsKey(searchISBN))
            System.out.println("Found: " + books.get(searchISBN));
        else
            System.out.println("Book not found");

        books.remove("978-3333333333");

        Map<String, String> sorted = new TreeMap<>(books);
        System.out.println("\nBooks Sorted by ISBN:");
        for (String isbn : sorted.keySet()) {
            System.out.println(isbn + " → " + sorted.get(isbn));
        }

        String searchTitle = "Java Programming";
        boolean found = false;
        for (String isbn : books.keySet()) {
            if (books.get(isbn).equalsIgnoreCase(searchTitle)) {
                System.out.println("\nTitle Found: " + isbn);
                found = true;
            }
        }
        if (!found) System.out.println("\nTitle not found");
    }
}
