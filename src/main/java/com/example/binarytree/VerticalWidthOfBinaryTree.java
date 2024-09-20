package com.example.binarytree;

import java.util.HashSet;

public class VerticalWidthOfBinaryTree {
    public static int verticalWidth(TreeNode root)
    {
        // code here.
        HashSet<Integer> hs = new HashSet<>();
        inorder(root,hs,0);
        return hs.size();
    }
    static void inorder(TreeNode root, HashSet<Integer> hs, int x) {
        if(root == null)
            return;
        inorder(root.left,hs,x-1);
        hs.add(x-1);
        inorder(root.right,hs,x+1);
    }
}
