package com.example.binarytree;

public class MergeTwoBinaryTree {
    public TreeNode solve(TreeNode A, TreeNode B) {
        if(A==null && B==null)
            return null;

        if(A==null)
            return B;
        if(B==null)
            return A;
        A.val=A.val+B.val;

        A.left=solve(A.left,B.left);
        A.right=solve(A.right,B.right);

        return A;
    }
}
