package com.example.binarysearchtree;

public class PreorderToPostOrder {
    static int i=0;
    public static BSTNode build(int pre[] , int n , int mxval)
    {
        if(i == n || pre[i] > mxval)
        {
            return null;
        }

        BSTNode root = new BSTNode(pre[i++]);

        root.left = build(pre , n , root.data);
        root.right = build(pre , n , mxval);
        return root;
    }
    public static BSTNode post_order(int pre[], int size)
    {
        //Your code here
        i = 0;
        return build(pre , size , Integer.MAX_VALUE);
    }
}
