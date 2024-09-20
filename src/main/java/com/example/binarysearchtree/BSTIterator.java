package com.example.binarysearchtree;

import java.util.Stack;

public class BSTIterator {
    private Stack<BSTNode<Number>> st = new Stack<>();
    int reverse = 1;

    public BSTIterator(BSTNode<Number> root, int isReverse) {
        reverse = isReverse;
        pushAll(root);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !st.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        BSTNode<Number> temp = st.pop();
        if (reverse == 0)
            pushAll(temp.right);
        else
            pushAll(temp.left);
        return temp.data;
    }

    public void pushAll(BSTNode<Number> root) {
        while (root != null) {
            st.push(root);
            if (reverse == 0)
                root = root.left;
            else
                root = root.right;
        }
    }
}
