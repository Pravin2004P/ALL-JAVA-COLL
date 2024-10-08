import java.util.ArrayList;

public class Weighted_Graph_print {
    public static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void printg(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        // Adding edges
        graph[0].add(new Edge(0, 5, 6));
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 6, 4));
    }

    public static void main(String[] args) {
        int v = 4; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];
        printg(graph);

        // Printing the edges of vertex 1
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.println("Destination: " + e.dest + ", Weight: " + e.weight);
        }
    }
}
