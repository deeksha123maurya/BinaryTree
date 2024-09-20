package com.example.binarytree;

public class TransformToSumTree {
    public int solve(TreeNode root)
    {
        if(root==null)
            return 0;

        int a=solve(root.left);
        int b=solve(root.right);
        int c=root.val;
        root.val=a+b;

        return a+b+c;
    }
    public void toSumTree(TreeNode root){
        //add code here.
        solve(root);
    }
}
