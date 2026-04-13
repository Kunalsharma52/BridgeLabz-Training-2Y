import java.util.*;

class SlidingWindow {
    static void maxWindow(int arr[], int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            while (!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offer(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peek()] + " ");
        }
    }
}