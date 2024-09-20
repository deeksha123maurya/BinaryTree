package com.example.binarytree;

public class TreeIsomorphism {
    boolean isIsomorphic(TreeNode root1, TreeNode root2)
    {
        // code here.
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 == null || root2 == null || root1.val != root2.val){
            return false;
        }
        boolean a = isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right);
        boolean b = isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left);
        return a || b;
    }
}
