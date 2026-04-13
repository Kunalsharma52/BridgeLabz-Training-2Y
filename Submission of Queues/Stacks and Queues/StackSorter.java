import java.util.Stack;

public class StackSorter {
    public static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            sortStack(s);
            insertSorted(s, temp);
        }
    }

    private static void insertSorted(Stack<Integer> s, int element) {
        if (s.isEmpty() || element > s.peek()) {
            s.push(element);
        } else {
            int temp = s.pop();
            insertSorted(s, element);
            s.push(temp);
        }
    }
}