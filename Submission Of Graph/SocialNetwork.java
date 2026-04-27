import java.util.*;

public class SocialNetwork {

    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("Alice", "Bob");
        addEdge("Alice", "Charlie");
        addEdge("Bob", "David");
        addEdge("Charlie", "Eve");
        addEdge("David", "Eve");

        // a) Friends of Alice
        System.out.println("Friends of Alice: " + graph.get("Alice"));

        // b) Direct connection check
        System.out.println("Bob & Eve directly connected? " + 
            graph.get("Bob").contains("Eve"));

        // c) Shortest path
        System.out.println("Shortest path Alice → Eve: " + bfs("Alice", "Eve"));
    }

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static List<String> bfs(String start, String end) {
        Queue<List<String>> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(Arrays.asList(start));

        while (!q.isEmpty()) {
            List<String> path = q.poll();
            String last = path.get(path.size() - 1);

            if (last.equals(end)) return path;

            if (!visited.contains(last)) {
                visited.add(last);

                for (String nei : graph.get(last)) {
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(nei);
                    q.add(newPath);
                }
            }
        }
        return new ArrayList<>();
    }
}