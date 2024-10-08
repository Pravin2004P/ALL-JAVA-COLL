import java.util.*;
public class Prinntallpath   {
    public static class Edge {
        int src;
        int dest;
        public Edge (int s , int d) {
            this.src = s;
            this.dest = d;
        }
    }
     public static void makethegraph(ArrayList<Edge> graph[]) {
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
    public static void Bfs (ArrayList <Edge> graph [] , int v , boolean vis []) {
        Queue<Integer> q = new LinkedList<>();
        boolean Vis[] = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!Vis[curr]) {
                System.out.print(curr + " ");
                Vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void Dfs (ArrayList <Edge> graph [] ,  boolean vis [], int curr) {
         System.out.println(curr + " ");
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(vis [e.dest] == false) {
                Dfs(graph, vis, curr);
            }
        }

    }
    public static void Prinntallpath (ArrayList<Edge> graph[], boolean vis [] , int curr , String path , int tar) {
        if(curr == tar) {
            System.out.println(path);
            return;
        }
        for(int i = 0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                vis[curr] = true;
                Prinntallpath(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false;
            }   
        }   
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v]; // Correct type declaration
        makethegraph(graph);
        int src = 0;
        int tar = 5;
        Prinntallpath(graph , new boolean[v] ,src , "0" , tar);
        // boolean vis[] = new boolean[v]; // Visited array for BFS and DFS

        // System.out.println("BFS Traversal:");
        // Bfs(graph, v, vis); // Call BFS

        // Arrays.fill(vis, false); // Reset visited array

        // System.out.print ln("\nDFS Traversal:");
        // Dfs(graph, vis, 0); // Call DFS starting from node 0  
    }
    
}
