package com.example.binarysearchtree;

public class CheckOrValidateABST {
    boolean isBST(BSTNode<Number> root)
    {
        // code here.
        return isValidBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isValidBST(BSTNode<Number> root, int mn, int mx)
    {
        if(root==null)
            return true;

        if(root.data<=mn || root.data>=mx)
            return false;

        return isValidBST(root.left,mn,root.data) && isValidBST(root.right,root.data,mx);
    }
}
