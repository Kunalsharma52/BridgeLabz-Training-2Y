import java.util.*;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem implements Reservable {
    private int itemId;
    private String title;
    private String author;
    private String borrower;
    private boolean isReserved;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected String getBorrower() {
        return borrower == null ? "No borrower info (confidential)" : "Confidential";
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            borrower = borrowerName;
            isReserved = true;
            System.out.println(title + " reserved by " + borrowerName);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem {
    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }
}

public class LBS {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(101, "Effective Java", "Joshua Bloch"));
        items.add(new Magazine(202, "Tech Today", "Various"));
        items.add(new DVD(303, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item.checkAvailability()) {
                item.reserveItem("Kunal Sharma");
            }
            System.out.println("Available: " + item.checkAvailability());
            System.out.println("----------------------");
        }
    }
}
