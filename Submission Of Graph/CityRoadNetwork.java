import java.util.*;

class Edge {
    String dest;
    int weight;

    Edge(String d, int w) {
        dest = d;
        weight = w;
    }
}

public class CityRoadNetwork {

    static Map<String, List<Edge>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("A", "B", 5);
        addEdge("B", "C", 3);
        addEdge("C", "B", 3);
        addEdge("A", "D", 7);
        addEdge("D", "A", 7);
        addEdge("D", "E", 2);
        addEdge("C", "E", 4);

        System.out.println("Reachable from A: " + dfs("A"));
        System.out.println("BFS path A → E: " + bfs("A", "E"));
    }

    static void addEdge(String u, String v, int w) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(new Edge(v, w));
        graph.putIfAbsent(v, new ArrayList<>());
    }

    static Set<String> dfs(String start) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            String node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                for (Edge e : graph.get(node)) {
                    stack.push(e.dest);
                }
            }
        }
        return visited;
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

                for (Edge e : graph.get(last)) {
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(e.dest);
                    q.add(newPath);
                }
            }
        }
        return new ArrayList<>();
    }
}