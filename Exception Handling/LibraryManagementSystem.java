import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String m){ super(m); } }
class InvalidReturnException extends Exception { public InvalidReturnException(String m){ super(m); } }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String m){ super(m); } }

public class LibraryManagementSystem {
    static Map<String, Boolean> books = new HashMap<>();
    static Map<String, List<String>> users = new HashMap<>();

    public static void borrowBook(String user, String book) throws BookNotAvailableException, UserLimitExceededException {
        books.putIfAbsent(book,true);
        users.putIfAbsent(user,new ArrayList<>());

        if(!books.get(book)) throw new BookNotAvailableException(book + " is not available");
        if(users.get(user).size() >= 5) throw new UserLimitExceededException(user + " reached limit");

        books.put(book,false);
        users.get(user).add(book);
        System.out.println(user + " borrowed " + book);
    }

    public static void main(String[] args) {
        try { borrowBook("Alice","Java101"); }
        catch(Exception e) { System.out.println(e.getMessage()); }
    }
}

