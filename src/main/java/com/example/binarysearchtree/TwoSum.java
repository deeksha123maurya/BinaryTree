package com.example.binarysearchtree;

public class TwoSum {
    public int t2Sum(BSTNode<Number> root, int k) {
        if(root==null)
            return 1;

        BSTIterator l=new BSTIterator(root,0);//0-next
        BSTIterator r=new BSTIterator(root,1);//1-before

        int i=l.next();
        int j=r.next();

        while(i<j)
        {
            if(i+j==k)
                return 1;
            else if(i+j<k)
                i=l.next();
            else
                j=r.next();
        }

        return 0;
    }
}

