package com.example.binarysearchtree;

public class PopulateInorderSuccessorForAllNodes {
    BSTNode prev;
    public void solve(BSTNode root)
    {
        if(root==null)
            return;

        solve(root.left);

        if(prev!=null)
        {
            prev.next=root;
        }
        prev=root;

        solve(root.right);
    }
    public void populateNext(BSTNode root){
        //code here
        prev=null;
        solve(root);
    }
}
