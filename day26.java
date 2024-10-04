import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day26 {
    
    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    static boolean isCyclicDFS(int node, boolean[] visited, int parent, List<List<Integer>> adj) {
        visited[node] = true;
        
        for (Integer adjacentNode : adj.get(node)) {
            if (!visited[adjacentNode]) {
                if (isCyclicDFS(adjacentNode, visited, node, adj)) {
                    return true;
                }
            } else if (adjacentNode != parent) {
                return true;
            }
        }
        return false;
    }
    
    static boolean detectCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicDFS(i, visited, -1, adj)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj, u, v);
        }

        System.out.println(detectCycle(V, adj));
        sc.close();
    }
}
