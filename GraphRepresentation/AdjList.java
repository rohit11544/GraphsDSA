import java.util.*;

public class AdjList {
    private int vertices;
    private List<List<Integer>> adjList;

    public AdjList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge from src to dest (for undirected graph, add both ways)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        // Uncomment the next line for undirected graph
        // adjList.get(dest).add(src);
    }

    // Print adjacency list
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    // Example usage
    public static void main(String[] args) {
        AdjList graph = new AdjList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}