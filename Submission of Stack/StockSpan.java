import java.util.Stack;

class StockSpan {
    static void calculateSpan(int price[], int n) {
        Stack<Integer> s = new Stack<>();
        int span[] = new int[n];

        s.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && price[s.peek()] <= price[i]) {
                s.pop();
            }
            span[i] = s.isEmpty() ? (i + 1) : (i - s.peek());
            s.push(i);
        }

        for (int x : span)
            System.out.print(x + " ");
    }
}