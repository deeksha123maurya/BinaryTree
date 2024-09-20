package com.example.binarytree;

public class HeightOfBinaryTree{
    int height(TreeNode node)
    {
        // code here
        if(node==null)return 0;

        int lh=height(node.left);

        int rh=height(node.right);

        return Math.max(lh,rh) + 1;
    }
}
