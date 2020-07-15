package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestInBSTTest {

    KthSmallestInBST test = new KthSmallestInBST();

    Node<Integer> root1;
    Node<Integer> root2;
    Node<Integer> root3;
    Node<Integer> root4;
    Node<Integer> root5;


    @Before
    public void setup() {

        //        5
        //       / \
        //      4   8
        //     /     \
        //    2      10
        root1 = new Node<Integer>(5,
                new Node<Integer>(4, new Node<Integer>(2), null),
                new Node<Integer>(8, null, new Node<Integer>(10)));

        //        5
        //       / \
        //      4    8
        //     / \  /  \
        //    2   3 7   10
        root2 = new Node<Integer>(5,
                new Node<Integer>(4, new Node<Integer>(2), new Node<Integer>(3)),
                new Node<Integer>(8, new Node<Integer>(7), new Node<Integer>(10)));

        //        3
        //       / \
        //      2   4
        //     /     \
        //    1      5
        root3 = new Node<Integer>(3,
                new Node<Integer>(2, new Node<Integer>(1), null),
                new Node<Integer>(4, null, new Node<Integer>(5)));

        // 5
        root4 = new Node<Integer>(5, null, null);

        //    1
        //   /
        // -1
        root5 = new Node<Integer>(1, new Node<Integer>(-1), null);
    }

    @Test
    public void findKthSmallest_1() {
        Node<Integer> result = test.findKthSmallest(root1, 2);
        int resultValue = result.value;
        assertEquals(4, resultValue);
    }

    @Test
    public void findKthSmallest_2() {
        Node<Integer> result = test.findKthSmallest(root2, 6);
        int resultValue = result.value;
        assertEquals(8, resultValue);
    }

    @Test
    public void findKthSmallest_3() {
        Node<Integer> result = test.findKthSmallest(root3, 5);
        int resultValue = result.value;
        assertEquals(5, resultValue);
    }

    @Test
    public void findKthSmallest_4() {
        Node<Integer> result = test.findKthSmallest(root4, 1);
        int resultValue = result.value;
        assertEquals(5, resultValue);
    }

    @Test
    public void findKthSmallest_5() {
        Node<Integer> result = test.findKthSmallest(root5, 1);
        int resultValue = result.value;
        assertEquals(-1, resultValue);
    }
}