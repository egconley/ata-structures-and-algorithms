package code401challenges.extras;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class levelOrderTreeFromArray {

    public Node<Integer> makeTree(Integer [] array) {

        if (array.length>0) {
            Node<Integer> root = new Node<>(array[0]);
            Node<Integer> root.left = new Node<>(array[0]);
        }
        if (array.length>1)  {
            Node
        }





        return root;
    }
}
