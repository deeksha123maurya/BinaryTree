package com.example.binarytree;

public class SumOfTheNodesOnLongestPathFromRootToLeaf {
    int maxLevel,maxSum;
    public void solve(TreeNode root,int level,int sum)
    {
        if(root==null)
            return ;

        sum+=root.val;
        level=level+1;

        solve(root.left,level,sum);
        solve(root.right,level,sum);

        if(level>maxLevel)
        {
            maxLevel=level;
            maxSum=sum;
        }
        else if(level==maxLevel)
        {
            maxSum=Math.max(sum,maxSum);
        }

    }
    public int sumOfLongRootToLeafPath(TreeNode root)
    {
        //code here
        maxLevel=maxSum=0;
        int level=0,sum=0;

        solve(root,level,sum);

        return maxSum;
    }
}
