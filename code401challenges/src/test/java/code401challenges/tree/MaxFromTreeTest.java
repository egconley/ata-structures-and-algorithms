package code401challenges.tree;

import code401challenges.utilities.Animal;
import code401challenges.utilities.AnimalShelter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxFromTreeTest {

    MaxFromTree test = new MaxFromTree();
    Tree<Integer> tree;

    @Before
    public void setup() {
        tree = new Tree<Integer>(new Node<Integer>(20,
                new Node<Integer>(25, new Node<Integer>(15), new Node<Integer>(2)),
                new Node<Integer>(100, new Node<Integer>(75), new Node<Integer>(45))));
    }

    //        20
    //       / \
    //      5   100
    //     /\   / \
    //    15  2 75 45

    @Test
    public void findMax_test() {
        Integer expected = 100;
//        assertEquals(expected, test.findMax(tree));

    }
}