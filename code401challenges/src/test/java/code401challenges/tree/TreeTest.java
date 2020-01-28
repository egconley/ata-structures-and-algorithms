package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    Tree<String> tree;

    @Before
    public void setup() {
        tree = new Tree<String>(new Node<String>("A",
                new Node<String>("B", new Node<String>("D"), new Node<String>("E")),
                new Node<String>("C", new Node<String>("F"), new Node<String>(null))));
    }

    //        A
    //       / \
    //      B   C
    //     /\   /
    //    D  E F

    @Test
    public void preOrder() {
        assertEquals("[A, B, D, E, C, F, null]", tree.preOrder().toString());
    }

    @Test
    public void inOrder() {
        assertEquals("[D, B, E, A, F, C, null]", tree.inOrder().toString());
    }

    @Test
    public void postOrder() {
        assertEquals("[D, E, B, F, null, C, A]", tree.postOrder().toString());
    }
}