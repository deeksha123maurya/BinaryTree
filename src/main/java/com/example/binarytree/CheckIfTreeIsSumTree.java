package com.example.binarytree;

public class CheckIfTreeIsSumTree {
    boolean f=true;

    int solve(TreeNode root)
    {
        if(root==null)
            return 0;

        if(root.left==null && root.right==null)
            return root.val;

        if(f==false)
            return 0;

        int a=solve(root.left);
        int b=solve(root.right);

        if(root.val!=a+b)
            f=false;

        return a+b+root.val;
    }
    boolean isSumTree(TreeNode root)
    {
        // Your code here
        f=true;
        solve(root);

        return f;
    }
}
