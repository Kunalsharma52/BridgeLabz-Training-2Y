import java.util.Stack;

class SortStack {
    static void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }

    static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sortStack(s);
            sortedInsert(s, x);
        }
    }
}