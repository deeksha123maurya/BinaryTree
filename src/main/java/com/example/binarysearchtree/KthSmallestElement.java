package com.example.binarysearchtree;

public class KthSmallestElement {
    private int ans = -1;
    private static int idx = 0;//idx=1 bhi ho to no effect
    void solve(BSTNode<Number> root, int k)
    {
        if(root==null)
            return;
        solve(root.left,k);

        idx++;
        if(k==idx)
        {
            ans=root.data;
            return;//Without this code will also work
        }

        solve(root.right,k);
    }
    public int KthSmallestElement(BSTNode<Number> root, int K) {
        // Write your code here
        if(root==null)
            return -1;
        idx=0;//if this is not present will give wrong ans;
        solve(root,K);
        return ans;
    }
}
