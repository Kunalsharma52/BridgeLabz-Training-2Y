class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB, Author: " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("ISBN123", "Java Basics", "James Gosling");
        b1.displayBookDetails();
        b1.setAuthor("Oracle");
        b1.displayBookDetails();

        EBook eb = new EBook("ISBN456", "Advanced Java", "Herbert Schildt", 5.2);
        eb.displayEBookDetails();
    }
}
