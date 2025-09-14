class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        if(this instanceof Book) {
            System.out.println("Library: " + libraryName + ", ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public static void main(String[] args) {
        Book b1 = new Book("978-1111", "Java Programming", "Alice");
        b1.displayDetails();
        Book.displayLibraryName();
    }
}
