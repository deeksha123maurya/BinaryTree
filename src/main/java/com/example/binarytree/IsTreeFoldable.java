package com.example.binarytree;

public class IsTreeFoldable {
    boolean mirror(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 == null || root2 == null) {
            return false;
        }

        return mirror(root1.left, root2.right) && mirror(root1.right, root2.left);
    }

    boolean IsFoldable(TreeNode node)
    {
        // your code
        if(node == null) return true;

        return mirror(node.left, node.right);
    }
}
