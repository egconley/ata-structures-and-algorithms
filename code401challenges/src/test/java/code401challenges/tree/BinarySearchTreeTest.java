package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree tree;

    @Before
    public void setup() {
        tree = new BinarySearchTree();
        tree.add(7);
        tree.add(10);
        tree.add(2);
        tree.add(4);
        tree.add(5);
    }

    @Test
    public void add() {
        assertEquals(7, (int) tree.root.value);
        assertEquals(10, (int) tree.root.right.value);
        assertEquals(2, (int) tree.root.left.value);
        assertEquals(4, (int) tree.root.left.right.value);
        assertEquals(5, (int) tree.root.left.right.right.value);
    }

    @Test
    public void contains() {
        assertTrue(tree.contains(tree.root, 5));
        assertFalse(tree.contains(tree.root, 6));
    }
}