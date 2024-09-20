package com.example.binarysearchtree;

public class MinimumAbsoluteDifferenceInBST {
    BSTNode prev = null;
    int diff = Integer.MAX_VALUE;
    public int getMinimumDifference(BSTNode root) {

        helper(root);
        return diff;

    }

    public void helper(BSTNode root){
        if(root == null) return ;
        //return getMin(root) - getMax(root);
        helper(root.left);
        if(prev!=null){
            diff = Math.min(diff, Math.abs(root.data-prev.data));
        }
        prev=root;

        helper(root.right);
    }
}
