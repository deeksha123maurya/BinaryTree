package com.example.binarysearchtree;

public class LCAofBST {
    BSTNode LCA(BSTNode root, int p, int q)
    {
        // code here.
        if(root==null) return null;
        int curr = root.data;
        if(curr < p && curr < q) {
            return LCA(root.right, p, q);
        }
        if(curr > p && curr > q) {
            return LCA(root.left, p, q);
        }
        return root;
    }
}
