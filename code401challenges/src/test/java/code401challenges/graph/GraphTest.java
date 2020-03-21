package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<String> test;

    @Before
    public void setup() {
        test = new Graph<String>();
    }

    @Test
    public void addNode() {
        test.addNode("Ellen");
        test.addNode("Christopher");
        assertTrue(test.getNodes().contains("Christopher"));
    }

    @Test
    public void addEdge() {
        test.addEdge("Ellen", "Christopher", 2, true);
    }

    @Test
    public void getNodes() {
    }

    @Test
    public void getNeighbors() {
    }

    @Test
    public void size() {
    }
}