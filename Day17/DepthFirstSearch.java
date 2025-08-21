package com.vc;
import java.util.*;

public class DepthFirstSearch {
    private int V;
    private LinkedList<Integer>[] adj;

    // Constructor
    DepthFirstSearch(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Utility function for DFS
    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n]) DFSUtil(n, visited);
        }
    }

    // DFS traversal
    void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        DepthFirstSearch g = new DepthFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.print("DFS starting from node 2: ");
        g.DFS(2);
    }
}
