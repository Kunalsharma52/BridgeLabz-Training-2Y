import java.util.*;

public class NetworkRouting {

    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("R1", "R2");
        addEdge("R1", "R3");
        addEdge("R2", "R4");
        addEdge("R3", "R4");
        addEdge("R4", "R5");
        addEdge("R5", "R6");

        System.out.println("Connected? " + isConnected());
        System.out.println("Min hops R1 → R6: " + bfs("R1", "R6"));
    }

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static boolean isConnected() {
        Set<String> visited = new HashSet<>();
        dfs("R1", visited);
        return visited.size() == graph.size();
    }

    static void dfs(String node, Set<String> visited) {
        visited.add(node);
        for (String nei : graph.get(node)) {
            if (!visited.contains(nei)) dfs(nei, visited);
        }
    }

    static int bfs(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String, Integer> dist = new HashMap<>();

        q.add(start);
        dist.put(start, 0);

        while (!q.isEmpty()) {
            String node = q.poll();

            if (node.equals(end)) return dist.get(node);

            for (String nei : graph.get(node)) {
                if (!dist.containsKey(nei)) {
                    dist.put(nei, dist.get(node) + 1);
                    q.add(nei);
                }
            }
        }
        return -1;
    }
}