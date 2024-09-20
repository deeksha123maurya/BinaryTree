package com.example.binarytree;

public class MaximumPathSumFromAnyNode {
    int maxPathSum(TreeNode node,int[] maxPath)
    {
        if(node==null)
            return 0;

        int left=Math.max(0,maxPathSum(node.left,maxPath));
        int right=Math.max(0,maxPathSum(node.right,maxPath));

        maxPath[0]=Math.max(maxPath[0],node.val+left+right);

        return node.val+Math.max(left,right);
    }
    int findMaxSum(TreeNode node)
    {
        //your code goes here
        int maxPath[]=new int[1];
        maxPath[0]=Integer.MIN_VALUE;
        maxPathSum(node,maxPath);

        return maxPath[0];
    }
}
