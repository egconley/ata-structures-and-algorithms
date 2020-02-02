package code401challenges.utilities;

import code401challenges.tree.Node;

import code401challenges.tree.Tree;

public class FizzBuzzTree {

    public Tree<String> fizzBuzzTree(Tree<Integer> intTree) {
        Node<String> answerRoot = fizzBuzzHelper(intTree.getRoot());
        return new Tree<>(answerRoot);
    }

    public Node<String> fizzBuzzHelper(Node<Integer> curr) {

        if (curr!=null) {
            Node<String> ansNode = new Node<>();
            if (curr.value%15==0) {
                ansNode.value = "FizzBuzz";
            } else if (curr.value%3==0) {
                ansNode.value = "Fizz";
            } else if (curr.value%5==0) {
                ansNode.value = "Buzz";
            } else {
                ansNode.value = curr.value.toString();
            }

            ansNode.left = fizzBuzzHelper(curr.left);
            ansNode.right = fizzBuzzHelper(curr.right);

            return ansNode;

        } else return null;
    }
}
