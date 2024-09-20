package com.example.binarysearchtree;
import java.lang.* ;

public class FlattenBSTToSortedArray {
    public static BSTNode<Number> ans,curr;
    public static void inOrder(BSTNode<Number> root){
        if(root==null) return;
        inOrder(root.left);
        curr.right=new BSTNode<Number>(root.data);
        curr=curr.right;
        inOrder(root.right);
    }
    public static BSTNode<Number> flatten(BSTNode<Number> root)
    {
        // Write your code here
        ans=new BSTNode<Number>(-1);
        curr=ans;
        inOrder(root);
        return ans.right;
    }
}
