package com.example.binarysearchtree;

public class IsDeadEnd {
    public static boolean isDeadEnd(BSTNode<Number> root)
    {
        boolean ans = dend(root,1,Integer.MAX_VALUE);
        return ans;
    }
    public static boolean dend(BSTNode<Number> root, int min, int max){
        if(root == null){
            return false;
        }
        if(min == max){
            return true;
        }
        return dend(root.left,min,root.data-1) || dend(root.right,root.data+1,max);
    }
}
