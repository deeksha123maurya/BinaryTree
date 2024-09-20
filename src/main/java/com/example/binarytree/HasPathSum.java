package com.example.binarytree;

public class HasPathSum {
    int sum=0;
    public int hasPathSum(TreeNode root, int target) {
        return hasPathSumUtil(root,target) == true ? 1 : 0;
    }
    public boolean hasPathSumUtil(TreeNode root,int target) {
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==target) return true;
            sum-=root.val;
            return false;
        }
        boolean right=hasPathSumUtil(root.right, target);
        boolean left=hasPathSumUtil(root.left, target);
        sum-=root.val;
        return right||left;
    }
}
