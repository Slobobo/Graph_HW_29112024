package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);

        System.out.println("Does vertex 2 exist? " + graph.hasVertex(2));
        System.out.println("Does edge exist between 1 and 3? " + graph.hasEdge(1, 3));

        graph.removeEdge(1, 3);
        graph.removeVertex(3);

        System.out.println("Does vertex 3 exist? " + graph.hasVertex(3));
        System.out.println("Does edge between 1 and 3 exist? " + graph.hasEdge(1, 3));
    }
}
