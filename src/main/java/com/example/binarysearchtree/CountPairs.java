package com.example.binarysearchtree;

import java.util.Stack;

class BSTIterators {
    private Stack<BSTNode<Number>> st = new Stack<>();
    boolean reverse = true;

    public BSTIterators(BSTNode<Number> root, boolean isReverse) {
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
        return st.peek().data;
    }

    public void pushAll(BSTNode<Number> root) {
        while (root != null) {
            st.push(root);
            if (reverse==false)
                root = root.left;
            else
                root = root.right;
        }
    }

    public void moveNext()
    {
        BSTNode<Number> temp = st.pop();
        if (reverse == false)
            pushAll(temp.right);
        else
            pushAll(temp.left);
    }
}
public class CountPairs {
    public static int countPairs(BSTNode<Number> root1, BSTNode<Number> root2, int k)
    {
        // Code here

        BSTIterators l=new BSTIterators(root1,false);//0-next
        BSTIterators r=new BSTIterators(root2,true);//1-before

        int cnt = 0;

        while(l.hasNext() && r.hasNext())
        {
            int i=l.next();
            int j=r.next();
            if(i+j==k)
            {
                cnt++;
                l.moveNext();
                r.moveNext();
            }
            else if(i+j<k)
                l.moveNext();
            else
                r.moveNext();
        }
        return cnt;
    }
}
