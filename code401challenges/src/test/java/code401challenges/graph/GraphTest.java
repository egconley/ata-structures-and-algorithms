package code401challenges.graph;

import code401challenges.LeftJoin.LeftJoin;
import org.junit.Before;
import org.junit.Test;

import java.util.Hashtable;

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