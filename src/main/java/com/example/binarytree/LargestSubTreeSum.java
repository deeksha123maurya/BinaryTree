package com.example.binarytree;

public class LargestSubTreeSum {
    static int mx;
    public static int solve(TreeNode root)
    {
        if(root==null)
            return 0;

        int ls=solve(root.left);
        int rs=solve(root.right);

        mx=Math.max(mx,ls+rs+root.val);

        return ls+rs+root.val;
    }
    public static int findLargestSubtreeSum(TreeNode root) {
        // code here
        mx=Integer.MIN_VALUE;
        solve(root);
        return mx;
    }
}
