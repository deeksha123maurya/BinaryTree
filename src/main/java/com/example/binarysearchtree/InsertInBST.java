package com.example.binarysearchtree;

public class InsertInBST {
    BSTNode<Number> insert(BSTNode<Number> root, int x) {
        // your code here
        BSTNode<Number> temp =root;
        BSTNode<Number> newNode = new BSTNode<Number>(x);
        while(temp!=null)
        {
            if(temp.data==x)
            {
                return root;

            }
            else if(x > temp.data)
            {
                if(temp.right==null)
                {
                    temp.right= newNode;
                }
                else
                {
                    temp=temp.right;
                }
            }
            else
            {
                if(temp.left==null)
                {
                    temp.left=newNode;
                }
                else
                {
                    temp=temp.left;
                }
            }
        }

        return newNode;
    }
}
