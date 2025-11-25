import java.util.*;

public class MaxKey {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",10,"B",20,"C",15);

        String maxKey = null;
        int maxVal = -1;

        for (String k : map.keySet()) {
            int v = map.get(k);
            if (v > maxVal) {
                maxVal = v;
                maxKey = k;
            }
        }

        System.out.println(maxKey);
    }
}
