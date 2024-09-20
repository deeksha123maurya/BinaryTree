package com.example.binarytree;

public class RemoveHalfNodes {
    public TreeNode traverse(TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            return root;
        }

        TreeNode l=null,r=null;

        if(root.left!=null)
            l=traverse(root.left);

        if(root.right!=null)
            r=traverse(root.right);

        root.left=l;
        root.right=r;

        if(l==null)
            return r;
        if(r==null)
            return l;

        return root;
    }
    public TreeNode solve(TreeNode root) {
        return traverse(root);
    }
}
