package com.example.binarytree;

public class ChildrenSumProperty {
    static boolean ChildrenSum(TreeNode root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.val;
        }
        if(root.right!=null){
            sum+=root.right.val;
        }
        return (sum==root.val && ChildrenSum(root.left) && ChildrenSum(root.right));
    }
    public static int isSumProperty(TreeNode root)
    {
        // add your code here
        if(ChildrenSum(root)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
