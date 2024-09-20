package com.example.binarysearchtree;

public class KthLargestElement {
    private int ans = -1;
    private static int idx = 0;//idx=1 bhi ho to no effect
    void solve(BSTNode<Number> root, int k)
    {
        if(root==null)
            return;
        solve(root.right,k);

        idx++;
        if(k==idx)
        {
            ans=root.data;
            return;//Without this code will also work
        }

        solve(root.left,k);
    }

    public int kthLargest(BSTNode<Number> root, int K)
    {
        //Your code here
        if(root==null)
            return -1;
        idx=0;//if this is not present will give wrong ans;
        solve(root,K);
        return ans;

    }
}
