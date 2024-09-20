package com.example.binarysearchtree;

public class CountBSTNodesThatLieInGivenRange {
    void Solve(BSTNode root,int l,int h,int[] count)
    {
        if(root==null) return;
        Solve(root.left,l,h,count);
        if(root.data>=l && root.data<=h)
            count[0]++;
        Solve(root.right,l,h,count);
    }
    int getCount(BSTNode root, int l, int h)
    {
        int[] count={0};
        Solve(root,l,h,count);
        return count[0];
    }
}
