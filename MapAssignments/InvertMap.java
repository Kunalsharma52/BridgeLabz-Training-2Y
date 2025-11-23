import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",1,"B",2,"C",1);
        Map<Integer, List<String>> result = new HashMap<>();

        for (String k : map.keySet()) {
            int v = map.get(k);
            result.putIfAbsent(v, new ArrayList<>());
            result.get(v).add(k);
        }

        System.out.println(result);
    }
}
