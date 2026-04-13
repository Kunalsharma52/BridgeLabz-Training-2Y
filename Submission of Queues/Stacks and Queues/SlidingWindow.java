import java.util.*;

public class SlidingWindow {
    public List<Integer> maxInWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove indices out of window
            if (!dq.isEmpty() && dq.peek() == i - k) dq.poll();

            // Remove smaller elements as they are no longer useful
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offer(i);
            if (i >= k - 1) result.add(arr[dq.peek()]);
        }
        return result;
    }
}