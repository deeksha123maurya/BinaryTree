package com.example.binarytree;

public class MaximumDiffBetweenNodeAndItsAncestor {
    int solve(TreeNode root,int[] diff)
    {
        if(root==null)
            return Integer.MAX_VALUE;

        int left=solve(root.left,diff);
        int right=solve(root.right,diff);

        diff[0]=Math.max(diff[0],root.val-Math.min(left,right));

        return Math.min(root.val,Math.min(left,right));
    }
    int maxDiff(TreeNode root)
    {
        //your code here
        int[] diff={Integer.MIN_VALUE};
        solve(root,diff);
        return diff[0];
    }
}
