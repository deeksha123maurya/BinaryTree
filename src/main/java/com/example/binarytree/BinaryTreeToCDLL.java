package com.example.binarytree;

public class BinaryTreeToCDLL {
    TreeNode head;
    TreeNode prev;

    //Function to convert binary tree into circular doubly linked list.
    TreeNode bTreeToClist(TreeNode root)
    {
        //your code here
        if (root == null) return null;

        // Recursively convert the left subtree
        bTreeToClist(root.left);

        if (prev == null) head = root;

        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root; // Update prev to the current node

        // Recursively convert the right subtree
        bTreeToClist(root.right);

        prev.right=head;
        head.left=prev;

        return head;
    }

}
