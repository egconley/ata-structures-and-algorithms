package code401challenges.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeSerialization {
    public String serializeTree(Node<Integer> root){

        StringBuilder builder = new StringBuilder();

        if (root==null) {
            builder.append("x,");
            return builder.toString();
        }

        String leftSerialized = serializeTree(root.left);
        String rightSerialized = serializeTree(root.right);
        builder.append(root.value + "," + leftSerialized + rightSerialized);

        return builder.toString();
    }



    public Node<Integer> restoreTree(String str){

        Queue<String> nodesLeft = new LinkedList<>();

        String[] array = str.split(",");
        nodesLeft.addAll(Arrays.asList(array));

        return restoreTreeHelper(nodesLeft);
    }

    public Node<Integer> restoreTreeHelper(Queue<String> nodesLeft) {

        String valueForNode = nodesLeft.poll();

        if (valueForNode.equals("x")) {
            return null;
        }

        Node<Integer> newNode = new Node<>(Integer.valueOf(valueForNode));
        newNode.left = restoreTreeHelper(nodesLeft);
        newNode.right = restoreTreeHelper(nodesLeft);

        return newNode;
    }
}
