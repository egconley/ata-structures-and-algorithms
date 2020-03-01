package code401challenges.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    TreeIntersection test = new TreeIntersection();
    Tree<Integer> tree1;
    Tree<Integer> tree2;

    @Before
    public void setup() {
        tree1 = new Tree<Integer>(new Node<Integer>(20,
                new Node<Integer>(25, new Node<Integer>(15), new Node<Integer>(2)),
                new Node<Integer>(100, new Node<Integer>(75), new Node<Integer>(45))));
        tree2 = new Tree<Integer>(new Node<Integer>(20,
                new Node<Integer>(30, new Node<Integer>(33), new Node<Integer>(2)),
                new Node<Integer>(100, new Node<Integer>(75), new Node<Integer>(50))));
    }

    @Test
    public void treeIntersection() {
        Set set = test.treeIntersection(tree1.getRoot(), tree2.getRoot());
        assertTrue(set.contains(20));
        assertTrue(set.contains(2));
        assertTrue(set.contains(100));
        assertTrue(set.contains(75));
        assertFalse(set.contains(33));
    }
}