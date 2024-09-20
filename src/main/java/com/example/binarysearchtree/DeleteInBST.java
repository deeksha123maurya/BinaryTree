package com.example.binarysearchtree;

public class DeleteInBST {
    public static BSTNode<Number> getSucc(BSTNode<Number> curr)
    {
        curr=curr.right;

        while(curr!=null && curr.left!=null)
        {
            curr=curr.left;

        }

        return curr;
    }

    // Function to delete a node from BST.
    public static BSTNode<Number> deleteNode(BSTNode<Number> root, int X) {
        if(root==null)
            return root;

        if(root.data>X)
            root.left=deleteNode(root.left, X);
        else if(root.data<X)
            root.right=deleteNode(root.right,X);
        else
        {
            if(root.left==null)
            {
                return root.right;

            }
            else if(root.right==null)
            {
                return root.left;
            }
            else
            {
                BSTNode<Number> curr=getSucc(root);
                root.data=curr.data;
                root.right=deleteNode(root.right,curr.data);
            }
        }

        return root;
    }
}
