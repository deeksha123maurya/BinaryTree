package com.example.binarysearchtree;

class NodeValue {
    public int maxNode, minNode, maxSize;

    NodeValue(int minNode, int maxNode, int maxSize) {
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }
}

public class LargestBSTInBT {
    static NodeValue largestBSTSubtreeHelper(BSTNode<Number> root) {
        // An empty tree is a BST of size 0.
        if (root==null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        // Get values from left and right subtree of current tree.
        NodeValue left = largestBSTSubtreeHelper(root.left);
        NodeValue right = largestBSTSubtreeHelper(root.right);

        // Current node is greater than max in left AND smaller than min in right, it is a BST.
        if (left.maxNode < root.data && root.data < right.minNode) {
            // It is a BST.
            return new NodeValue(Math.min(root.data, left.minNode), Math.max(root.data, right.maxNode),
                    left.maxSize + right.maxSize + 1);
        }

        // Otherwise, return [-inf, inf] so that parent can't be valid BST
        //different from return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(BSTNode<Number> root)
    {
        // Write your code here
        return largestBSTSubtreeHelper(root).maxSize;

    }
}
