package com.example.binarytree;

public class SymmetricBinaryTree {
    public int isSymmetricUtil(TreeNode A, TreeNode B) {
        if(A==null && B==null) return 1;
        if(A==null || B==null) return 0;
        if(A.val!=B.val) return 0;
        return isSymmetricUtil(A.left,B.right) & isSymmetricUtil(A.right,B.left);
    }
    public int isSymmetric(TreeNode A)
    {
        if(A==null)
        {
            return 1;
        }
        return isSymmetricUtil(A.left,A.right);
    }
}
