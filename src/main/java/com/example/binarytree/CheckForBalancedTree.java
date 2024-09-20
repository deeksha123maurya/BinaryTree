package com.example.binarytree;

public class CheckForBalancedTree {
    int dfsHeight(TreeNode root)
    {
        if(root==null)
            return 0;

        int lh=dfsHeight(root.left);
        if(lh==-1)
            return -1;

        int rh=dfsHeight(root.right);
        if(rh==-1)
            return -1;

        if(Math.abs(lh-rh)>1)
            return -1;

        return Math.max(rh,lh)+1;
    }
    boolean isBalanced(TreeNode root)
    {
        // Your code here
        return dfsHeight(root)!=-1;
    }
}
