import java.util.*;

public class CoursePrerequisite {

    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("CS101", "CS102");
        addEdge("CS101", "CS201");
        addEdge("CS102", "CS202");
        addEdge("MATH101", "CS201");

        System.out.println("Cycle exists? " + hasCycle());

        System.out.println("Courses before CS202: " + findPrereq("CS202"));

        System.out.println("Topological Order: " + topoSort());
    }

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
        graph.putIfAbsent(v, new ArrayList<>());
    }

    // Cycle detection using DFS
    static boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> rec = new HashSet<>();

        for (String node : graph.keySet()) {
            if (dfsCycle(node, visited, rec)) return true;
        }
        return false;
    }

    static boolean dfsCycle(String node, Set<String> visited, Set<String> rec) {
        if (rec.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        rec.add(node);

        for (String nei : graph.get(node)) {
            if (dfsCycle(nei, visited, rec)) return true;
        }

        rec.remove(node);
        return false;
    }

    // Find prerequisites
    static Set<String> findPrereq(String target) {
        Set<String> result = new HashSet<>();
        for (String node : graph.keySet()) {
            if (dfsFind(node, target, new HashSet<>())) {
                result.add(node);
            }
        }
        return result;
    }

    static boolean dfsFind(String curr, String target, Set<String> visited) {
        if (curr.equals(target)) return true;
        visited.add(curr);

        for (String nei : graph.get(curr)) {
            if (!visited.contains(nei) && dfsFind(nei, target, visited))
                return true;
        }
        return false;
    }

    // Topological sort
    static List<String> topoSort() {
        Map<String, Integer> indegree = new HashMap<>();
        for (String node : graph.keySet()) {
            indegree.put(node, 0);
        }

        for (String node : graph.keySet()) {
            for (String nei : graph.get(node)) {
                indegree.put(nei, indegree.get(nei) + 1);
            }
        }

        Queue<String> q = new LinkedList<>();
        for (String node : indegree.keySet()) {
            if (indegree.get(node) == 0) q.add(node);
        }

        List<String> order = new ArrayList<>();

        while (!q.isEmpty()) {
            String curr = q.poll();
            order.add(curr);

            for (String nei : graph.get(curr)) {
                indegree.put(nei, indegree.get(nei) - 1);
                if (indegree.get(nei) == 0) q.add(nei);
            }
        }

        return order;
    }
}