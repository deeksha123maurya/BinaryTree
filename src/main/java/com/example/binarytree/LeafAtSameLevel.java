package com.example.binarytree;

public class LeafAtSameLevel {
    int height(TreeNode root)
    {
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    boolean Check(TreeNode root,int mylevel,int k)
    {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            if(mylevel != k){
                return false;
            }
        }
        return Check(root.left,mylevel+1,k) && Check(root.right,mylevel+1,k);
    }
    boolean check(TreeNode root)
    {
        int k = height(root);
        return Check(root,1,k);
    }
}
