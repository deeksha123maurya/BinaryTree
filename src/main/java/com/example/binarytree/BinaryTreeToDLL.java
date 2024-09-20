package com.example.binarytree;

public class BinaryTreeToDLL {
    TreeNode prev=null;
    TreeNode bToDLL(TreeNode root)
    {
        //  Your code here
        if(root==null)
            return null;

        TreeNode head=bToDLL(root.left);

        if(prev==null)
        {
            head=root;
        }
        else
        {
            root.left=prev;
            prev.right=root;
        }
        prev=root;

        bToDLL(root.right);

        return head;
    }
}
