package com.example.binarysearchtree;
import java.util.*;
class BSTIteratorss {
    private Stack<BSTNode<Number>> st=new Stack<>();
    public BSTIteratorss(BSTNode<Number> root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !st.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return st.peek().data;
    }

    public void pushAll(BSTNode<Number> root)
    {
        for(;root!=null;st.push(root),root=root.left);
    }

    public void moveNext()
    {
        BSTNode<Number> temp = st.pop();
        pushAll(temp.right);
    }
}

public class MergeTwoBST {
    public List<Integer> merge(BSTNode<Number> root1, BSTNode<Number> root2)
    {
        // Write your code here
        List<Integer>ans=new ArrayList<>();

        BSTIteratorss l=new BSTIteratorss(root1);
        BSTIteratorss r=new BSTIteratorss(root2);

        while(l.hasNext() && r.hasNext())
        {
            if(l.next() < r.next())
            {
                ans.add(l.next());
                l.moveNext();
            }
            else
            {
                ans.add(r.next());
                r.moveNext();
            }
        }

        while(l.hasNext())
        {
            ans.add(l.next());
            l.moveNext();
        }

        while(r.hasNext())
        {
            ans.add(r.next());
            r.moveNext();
        }

        return ans;
    }
}
