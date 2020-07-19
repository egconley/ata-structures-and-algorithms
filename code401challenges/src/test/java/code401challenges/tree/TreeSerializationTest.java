package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeSerializationTest {

    TreeSerialization test = new TreeSerialization();

    Node<Integer> root1;
    Node<Integer> root2;
    Node<Integer> root3;
    Node<Integer> root4;
    Node<Integer> root5;


    @Before
    public void setup() {

        //        1
        //       / \
        //      2   3
        //     /\   /\
        //    4  5 6  7
        root1 = new Node<Integer>(1,
                new Node<Integer>(2, new Node<Integer>(4), new Node<Integer>(5)),
                new Node<Integer>(3, new Node<Integer>(6), new Node<Integer>(7)));

        //  1
        root2 = new Node<Integer>(1);

        //     1
        //    /
        //   2
        //  /
        // 3
        root3 = new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(3), null), null);
    }

    @Test
    public void serializeTree1() {
        String serialized = test.serializeTree(root1);
        assertEquals("1,2,4,x,x,5,x,x,3,6,x,x,7,x,x,", serialized);
    }

    @Test
    public void serializeTree2() {
        String serialized = test.serializeTree(root2);
        assertEquals("1,x,x,", serialized);
    }

    @Test
    public void serializeTree3() {
        String serialized = test.serializeTree(root3);
        assertEquals("1,2,3,x,x,x,x,", serialized);
    }

    @Test
    public void restoreTree1() {
        Node<Integer> restored = test.restoreTree("1,2,4,x,x,5,x,x,3,6,x,x,7,x,x,");
        String serialized = test.serializeTree(restored);
        assertEquals("1,2,4,x,x,5,x,x,3,6,x,x,7,x,x,", serialized);
    }

    @Test
    public void restoreTree2() {
        Node<Integer> restored = test.restoreTree("1,x,x,");
        String serialized = test.serializeTree(restored);
        assertEquals("1,x,x,", serialized);
    }

    @Test
    public void restoreTree3() {
        Node<Integer> restored = test.restoreTree("1,2,3,x,x,x,x,");
        String serialized = test.serializeTree(restored);
        assertEquals("1,2,3,x,x,x,x,", serialized);
    }
}