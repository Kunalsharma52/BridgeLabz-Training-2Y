import java.util.*;

public class GenerateBinary {
    public static void main(String[] args) {

        int n = 5;
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for(int i=0; i<n; i++){
            String front = q.remove();
            System.out.println(front);

            q.add(front + "0");
            q.add(front + "1");
        }
    }
}
