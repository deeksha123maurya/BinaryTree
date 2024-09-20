package com.example.binarysearchtree;

public class MinimumDifferenceOrClosestToGivenValue {
    static int minDiff(BSTNode  root, int K)
    {
        // Write your code here
        int res = Integer.MAX_VALUE;
        while(root!=null){
            res = Math.min(res, Math.abs(K-root.data));
            if(root.data == K) return 0;
            else if(root.data > K) root = root.left;
            else root = root.right;
        }
        return res;
    }
}
