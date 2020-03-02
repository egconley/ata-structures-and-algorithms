package code401challenges.graph;

import java.util.*;

// resource: https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
public class Graph<T> {
    // store edges in a hashmap
    private Map<T, List<Edge>> edgeMap = new HashMap<>();

//    Adds a new node to the graph
//    Takes in the value of that node
//    Returns the added node
    public void addNode(T node) {
        edgeMap.put(node, new LinkedList<Edge>());
    }
//
//    AddEdge()
//    Adds a new edge between two nodes in the graph
//    Include the ability to have a “weight”
//    Takes in the two nodes to be connected by the edge
//    Both nodes should already be in the Graph
    public void addEdge(T source, T destination, int weight, boolean bidirectional) {

        Edge edge = new Edge(source, destination, weight);

        // if the edgeMap doesn't already contain the source and destination nodes, add them
        if (!edgeMap.containsKey(source)) {
            addNode(source);
        }
        if (!edgeMap.containsKey(destination)) {
            addNode(destination);
        }

        // add edges to list associated with the source node
        edgeMap.get(source).add(edge);
        // (and destination node, if bidirectional)
        if (bidirectional) {
            edgeMap.get(destination).add(edge);
        }
    }

//    GetNodes()
//    Returns all of the nodes in the graph as a collection (set, list, or similar)
    public Set<T> getNodes() {
        Set<T> nodeSet = edgeMap.keySet();
        return nodeSet;
    }

//    GetNeighbors()
//    Returns a collection of edges connected to the given node
//    Takes in a given node
//    Include the weight of the connection in the returned collection
    public List<Edge> getNeighbors(T node) {
        return edgeMap.get(node);
    }

//    Size()
//    Returns the total number of nodes in the graph
    public int size() {
        return getNodes().size();
    }
}
