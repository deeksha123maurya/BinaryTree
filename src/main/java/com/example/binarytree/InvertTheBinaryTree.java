package com.example.binarytree;

public class InvertTheBinaryTree {
    public void swap(TreeNode curr)
    {
        if(curr==null)
            return;

        swap(curr.left);
        swap(curr.right);

        TreeNode temp=curr.left;
        curr.left=curr.right;
        curr.right=temp;
    }
    public TreeNode invertTree(TreeNode root) {

        swap(root);
        return root;
    }
}


