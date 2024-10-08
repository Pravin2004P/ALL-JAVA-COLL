import java.util.*;

public class DFS {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to construct the graph
    public static void makethegraph(ArrayList<Edge>[] graph) {
        // Adding edges to the graph using Edge objects
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // BFS traversal method
    public static void BFS(ArrayList<Edge>[] graph, int v) {
        boolean[] vis = new boolean[v];  // Visited array
        Queue<Integer> q = new LinkedList<>();
        q.add(0);  // Start BFS from node 0
        vis[0] = true;  // Mark node 0 as visited

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");  // Print the current node

            // Visit all the neighbors of the current node
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);  // Get the edge
                if (!vis[e.dest]) {  // If the neighbor hasn't been visited
                    q.add(e.dest);   // Add it to the queue
                    vis[e.dest] = true;  // Mark it as visited
                }
            }
        }
    }
    
    public static void DFS (ArrayList<Edge> graph[],int curr,boolean vis []) {
        if(vis [curr]) {
            return;
        }
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            DFS(graph, e.dest, vis);
        }
    }

    public static void main(String[] args) {
        int v = 7;  // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];  // Create the graph

        // Initialize each vertex's adjacency list
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        boolean vis[] = new boolean[v];
        // Construct the graph using the makethegraph() method
        makethegraph(graph);

        // Perform BFS traversal starting from node 0
        DFS(graph, 0, vis);
    }
}
