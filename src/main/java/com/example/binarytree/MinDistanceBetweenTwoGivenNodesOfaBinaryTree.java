package com.example.binarytree;

public class MinDistanceBetweenTwoGivenNodesOfaBinaryTree {
    TreeNode lca(TreeNode root, int n1,int n2)
    {
        // Your code here
        if(root==null)
            return null;

        if(root.val==n1 || root.val==n2)
            return root;

        TreeNode left=lca(root.left,n1,n2);
        TreeNode right=lca(root.right,n1,n2);

        if(left!=null && right!=null)
            return root;

        if(left!=null)
            return left;
        else
            return right;
    }

    int solve(TreeNode root,int val)
    {
        if(root==null)
            return 0;

        if(root.val==val)
            return 1;

        int a=solve(root.left,val);
        int b=solve(root.right,val);

        if(a==0 && b==0)
            return 0;
        else
            return a+b+1;
    }
    int findDist(TreeNode root, int a, int b) {
        // Your code here
        TreeNode LCA=lca(root,a,b);

        int x=solve(LCA,a);
        int y=solve(LCA,b);

        return x+y-2;
    }
}
