package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    FizzBuzzTree test = new FizzBuzzTree();
    Tree<Integer> tree;

    @Before
    public void setup() {
        tree = new Tree<Integer>(new Node<Integer>(5,
                new Node<Integer>(30, new Node<Integer>(4), new Node<Integer>(10)),
                new Node<Integer>(3, new Node<Integer>(8), new Node<Integer>(5))));
    }

    //        5
    //       / \
    //      30   3
    //     /\   / \
    //    4  10 8  5

    @Test
    public void fizzBuzzTree() {
        System.out.println(test.fizzBuzzTree(tree).toString());
        assertEquals("[Buzz, FizzBuzz, 4, Buzz, Fizz, 8, Buzz]", test.fizzBuzzTree(tree).preOrder().toString());
    }

}