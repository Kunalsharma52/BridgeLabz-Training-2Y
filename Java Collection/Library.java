import java.util.*;

class Book { String id,title; Book(String id,String t){this.id=id;this.title=t;} public String toString(){return id+":"+title;} }

public class Library {
    List<Book> books = new ArrayList<>();
    Set<String> members = new HashSet<>();
    Queue<Book> issueQueue = new LinkedList<>();
    Stack<Book> returnedStack = new Stack<>();

    public void addBook(Book b){ books.add(b); }
    public void registerMember(String mid){ if(!members.add(mid)) System.out.println("Duplicate member"); }
    public void requestIssue(Book b){ issueQueue.add(b); }
    public void issueNext(){ Book b=issueQueue.poll(); if(b!=null) System.out.println("Issued "+b); }
    public void returnBook(Book b){ returnedStack.push(b); System.out.println("Returned "+b); }
    public void reissueRecent(){ if(!returnedStack.isEmpty()) System.out.println("Reissued "+returnedStack.pop()); }
    public static void main(String[] args){
        Library lib = new Library();
        lib.addBook(new Book("B1","Java"));
        lib.registerMember("M1"); lib.registerMember("M1");
        lib.requestIssue(new Book("B1","Java"));
        lib.issueNext();
        lib.returnBook(new Book("B2","DS"));
        lib.reissueRecent();
    }
}
