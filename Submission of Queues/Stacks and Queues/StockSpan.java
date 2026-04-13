import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            span[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }
}