package com.example.binarysearchtree;

import java.util.Stack;

public class BinarySearchTreeIterator {
    private Stack<BSTNode<Number>> st=new Stack<>();
    public BinarySearchTreeIterator(BSTNode<Number> root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !st.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        BSTNode<Number> temp=st.pop();
        pushAll(temp.right);
        return temp.data;
    }

    public void pushAll(BSTNode<Number> root)
    {
        for(;root!=null;st.push(root),root=root.left);
    }
}
