import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> m1 = Map.of("A",1,"B",2);
        Map<String, Integer> m2 = Map.of("B",3,"C",4);

        Map<String, Integer> result = new HashMap<>(m1);

        for (String k : m2.keySet()) {
            int v = result.getOrDefault(k, 0) + m2.get(k);
            result.put(k, v);
        }

        System.out.println(result);
    }
}
