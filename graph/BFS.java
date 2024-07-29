package Graph;
import java.util.*;

public class BFS {

    public static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph with empty adjacency lists
        for (int i = 0; i < 6; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Adding edges
        graph.get(0).addAll(Arrays.asList(1, 2, 5));
        graph.get(1).addAll(Arrays.asList(5, 0));
        graph.get(2).addAll(Arrays.asList(0, 3, 4));
        graph.get(3).addAll(Arrays.asList(2, 4));
        graph.get(4).addAll(Arrays.asList(2, 3, 5));
        graph.get(5).addAll(Arrays.asList(0, 1, 4));

        // Perform BFS traversal starting from node 0
        System.out.println("BFS traversal starting from node 0:");
        bfsTraversal(graph, 0);
    }
}
