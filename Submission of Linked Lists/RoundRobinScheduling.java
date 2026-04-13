class Process {
    int id, burst;
    Process next;

    Process(int i, int b) {
        id = i;
        burst = b;
    }
}

public class RoundRobinScheduling {
    static Process head;

    static void execute(int quantum) {
        Process temp = head;

        while (temp != null) {
            if (temp.burst > quantum) {
                temp.burst -= quantum;
                System.out.println("Process " + temp.id + " remaining: " + temp.burst);
            } else {
                System.out.println("Process " + temp.id + " completed");
                temp.burst = 0;
            }
            temp = temp.next;
        }
    }
}