import java.util.*;

public class BFS_AND_DFS {
    // Edge class to represent graph edges
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create and initialize the graph
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
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

    // BFS Method
    public static void bfs(ArrayList<Edge> graph[], boolean vis[], int v) {
        Queue<Integer> q = new LinkedList<>();

        int startNode = 0; // Starting node for BFS
        q.add(startNode);
        vis[startNode] = true; // Mark as visited

        System.out.println("BFS Traversal:");

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            // Explore all neighbors of the current node
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) { // If neighbor hasn't been visited
                    q.add(e.dest);   // Add to queue
                    vis[e.dest] = true; // Mark as visited
                }
            }
        }
        System.out.println(); // For better output formatting
    }

    // DFS Method
    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr) {
        System.out.print(curr + " "); // Visit current node
        vis[curr] = true; // Mark as visited

        // Explore all neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) { // If neighbor hasn't been visited
                dfs(graph, vis, e.dest); // Recursively visit
            }
        }
    }

    // Method to print all paths from src to tar
    public static void printAllPaths(ArrayList<Edge> graph[], boolean vis[], int curr, int tar, String path) {
        // Append current node to the path
        path += curr + " ";

        // If current node is the target, print the path
        if (curr == tar) {
            System.out.println(path);
            return;
        }

        // Mark the current node as visited
        vis[curr] = true;

        // Explore all neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) { // If neighbor hasn't been visited
                printAllPaths(graph, vis, e.dest, tar, path); // Recursive call
            }
        }

        // Backtrack: Unmark the current node to allow other paths
        vis[curr] = false;
    }

    public static void main(String[] args) {
        int v = 7; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v]; // Visited array for BFS and DFS

        createGraph(graph); // Initialize the graph with edges

        // Perform BFS
        bfs(graph, vis, v);

        // Reset visited array before DFS
        Arrays.fill(vis, false);
        System.out.println("DFS Traversal:");
        dfs(graph, vis, 0); // Start DFS from node 0
        System.out.println(); // For better output formatting

        // Find and print all paths from src to tar
        int src = 0; // Source node
        int tar = 5; // Target node
        System.out.println("All paths from " + src + " to " + tar + ":");
        printAllPaths(graph, new boolean[v], src, tar, "");
    }
}
 