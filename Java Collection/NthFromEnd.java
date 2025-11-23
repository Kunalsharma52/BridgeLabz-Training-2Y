import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 2;

        ListIterator<String> fast = ll.listIterator();
        ListIterator<String> slow = ll.listIterator();

        for(int i = 0; i < n; i++){
            fast.next();
        }

        while(fast.hasNext()){
            fast.next();
            slow.next();
        }

        System.out.println("Nth element from end: " + slow.next());
    }
}
