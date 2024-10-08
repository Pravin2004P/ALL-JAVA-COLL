import java.util.*;

public class pr {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void makethegraph(ArrayList<Edge> graph[]) {
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

    public static void bfs(ArrayList<Edge> graph[], int v) {
        boolean vis[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;  // Mark the start node as visited

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            // Traverse all adjacent vertices
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    q.add(e.dest);
                    vis[e.dest] = true;  // Mark node as visited when enqueued
                }
            }
        }
    }
    public static void dfs (ArrayList<Edge> graph[] , int curr , boolean vis []) {
        if(graph == null) {
            return;
        }
        System.err.println(curr + " ");
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false) {
                dfs(graph, e.dest, vis);    
            }
            

        }
    }

    public static void main(String[] args) {
        int v = 7;  // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis [] = new boolean[v];
         makethegraph(graph);
         bfs(graph, v);
        dfs(graph, 0, vis);
        System.out.println();
    }
}
