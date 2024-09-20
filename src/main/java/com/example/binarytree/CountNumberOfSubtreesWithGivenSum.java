package com.example.binarytree;

public class CountNumberOfSubtreesWithGivenSum {
    int c;
    int sum(TreeNode root,int X){
        if(root==null){
            return 0;
        }
        int l=sum(root.left,X);
        int r=sum(root.right,X);
        int s=l+r+root.val;
        if(s==X){
            c++;
        }
        return s;
    }
    int countSubtreesWithSumX(TreeNode root, int X){
        c=0;
        sum(root,X);
        return c;
    }
}
