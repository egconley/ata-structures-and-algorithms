package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfHalfNodesInTreeTest {

    NumberOfHalfNodesInTree test = new NumberOfHalfNodesInTree();

    Node<Integer> root1;
    Node<Integer> root2;
    Node<Integer> root3;
    Node<Integer> root4;
    Node<Integer> root5;
    Node<Integer> root6;
    Node<Integer> root7;


    @Before
    public void setup() {

        //        1
        //       / \
        //      2    3
        //     / \  /  \
        //    4   5 6   7
        //   /
        //  8
        root1 = new Node<Integer>(1,
                new Node<Integer>(2, new Node<Integer>(4, new Node(8), null), new Node<Integer>(5)),
                new Node<Integer>(3, new Node<Integer>(6), new Node<Integer>(7)));

        //        1
        //       / \
        //      2    3
        //     / \  /  \
        //    4   5 6   7
        root2 = new Node<Integer>(1,
                new Node<Integer>(2, new Node<Integer>(4), new Node<Integer>(5)),
                new Node<Integer>(3, new Node<Integer>(6), new Node<Integer>(7)));

        //        1
        //       / \
        //      2   3
        root3 = new Node<Integer>(1, new Node<Integer>(2), new Node<Integer>(3));

        // 1
        root4 = new Node<Integer>(1, null, null);

        //    1
        //     \
        //      9
        //     /
        //    4
        root5 = new Node<Integer>(1,
                null, new Node<Integer>(9,
                new Node<Integer>(4), null));

        //        1
        //       /
        //      2
        //     /
        //    3
        //     \
        //      4
        root6 = new Node<Integer>(1,
                new Node<Integer>(2,
                        new Node<Integer>(3, null, new Node<Integer>(4)), null), null);

        //        1
        //       / \
        //      2    3
        //     /
        //    4
        //     \
        //      5
        root7 = new Node<Integer>(1,
                new Node<Integer>(2, new Node<Integer>(4, null, new Node<Integer>(5)), null),
                new Node<Integer>(3));
    }

    @Test
    public void numberOfHalfNodes_1() {
        assertEquals(1, test.numberOfHalfNodes(root1));
    }

    @Test
    public void numberOfHalfNodes_2() {
        assertEquals(0, test.numberOfHalfNodes(root2));
    }

    @Test
    public void numberOfHalfNodes_3() {
        assertEquals(0, test.numberOfHalfNodes(root3));
    }

    @Test
    public void numberOfHalfNodes_4() {
        assertEquals(0, test.numberOfHalfNodes(root4));
    }

    @Test
    public void numberOfHalfNodes_5() {
        assertEquals(2, test.numberOfHalfNodes(root5));
    }

    @Test
    public void numberOfHalfNodes_6() {
        assertEquals(3, test.numberOfHalfNodes(root6));
    }

    @Test
    public void numberOfHalfNodes_7() {
        assertEquals(2, test.numberOfHalfNodes(root7));
    }

    @Test
    public void numberOfHalfNodes_8() {
        assertEquals(0, test.numberOfHalfNodes(null));
    }
}