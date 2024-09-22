package com.example.binarytree;

public class DiameterOfBinaryTree {
    int diameter(TreeNode root) {
        int[] dia = new int[1];
        height(root,dia);
        return dia[0];
    }
    int height(TreeNode root,int[] dia) {
        if(root == null)
            return 0;
        int lf = height(root.left,dia);
        int rt = height(root.right,dia);
        dia[0] = Math.max(dia[0],lf+rt+1);
        return 1+Math.max(lf,rt);
    }
}
