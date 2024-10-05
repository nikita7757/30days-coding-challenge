import java.util.*;

public class day27 {

    static void bfs(List<List<Integer>> graph, int S, List<Integer> par, List<Integer> dist) {
        Queue<Integer> q = new LinkedList<>();
        dist.set(S, 0);
        q.add(S);

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : graph.get(node)) {
                if (dist.get(neighbor) == Integer.MAX_VALUE) {
                    par.set(neighbor, node);
                    dist.set(neighbor, dist.get(node) + 1);
                    q.add(neighbor);
                }
            }
        }
    }

    static int printShortestDistance(List<List<Integer>> graph, int S, int D, int V) {
        List<Integer> par = new ArrayList<>(Collections.nCopies(V, -1));
        List<Integer> dist = new ArrayList<>(Collections.nCopies(V, Integer.MAX_VALUE));

        bfs(graph, S, par, dist);

        if (dist.get(D) == Integer.MAX_VALUE) {
            System.out.println("Source and Destination are not connected");
            return -1;
        }

        return dist.get(D);  // Return the shortest distance instead of printing the path
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter the edges (format: u v): ");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        System.out.print("Starting vertex: ");
        int S = sc.nextInt();

        System.out.print("ending vertex: ");
        int D = sc.nextInt();

        int shortestDistance = printShortestDistance(graph, S, D, V);
        System.out.println("Shortest distance: " + shortestDistance);

        sc.close();
    }
}
