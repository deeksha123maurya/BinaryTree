package com.example.binarytree;

public class PopulatingNextRightPointersInEachNode {
    public TreeNode connect(TreeNode root) {
        if(root==null)
            return null;

        TreeNode curr=root;

        while(curr.left!=null)
        {
            TreeNode temp=curr;

            while(curr!=null)
            {
                curr.left.next=curr.right;
                curr.right.next=curr.next==null?null:curr.next.left;
                curr=curr.next;
            }

            curr=temp.left;
        }

        return root;

    }
}
