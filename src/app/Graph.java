package app;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new ArrayList<>());
            System.out.println("Vertex " + vertex + " added.");
        } else {
            System.out.println("Vertex " + vertex + " already exist.");
        }
    }

    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencyList.containsKey(destination)) {
            addVertex(destination);
        }
        adjacencyList.get(source).add(destination);
        System.out.println("Edge with " + source + " to " + destination + " added.");
    }

    public void removeVertex(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            adjacencyList.remove(vertex);
            for (List<Integer> neighbors : adjacencyList.values()) {
                neighbors.remove(Integer.valueOf(vertex));
            }
            System.out.println("Vertex " + vertex + " removed.");
        } else {
            System.out.println("Vertex " + vertex + " not found.");
        }
    }

    public void removeEdge(int source, int destination) {
        if (adjacencyList.containsKey(source) && adjacencyList.get(source)
                .remove(Integer.valueOf(destination))) {
            System.out.println("Edge with source "
                    + source + " to " + destination + " removed.");
        } else {
            System.out.println("Edge with source "
                    + source + " to " + destination + " not found.");
        }
    }

    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList
                .get(source).contains(destination);
    }

}
