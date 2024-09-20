package com.example.binarytree;

import java.util.ArrayList;

public class ConstructTreeFromPreAndIn {
    static int idx;
    public static int search(ArrayList<Integer> in, int s, int e, int element)
    {
        for(int i=s;i<=e;i++)
        {
            if(in.get(i)==element)
                return i;
        }

        return -1;
    }
    public TreeNode solve(ArrayList<Integer> pre, ArrayList<Integer> in,int s,int e,int n)
    {
        if(s>e || idx>=n)
            return null;
        int element = pre.get(idx);
        idx++;
        TreeNode res=new TreeNode(element);
        if(s==e)
            return res;

        int mid=search(in,s,e,element);

        res.left=solve(pre,in,s,mid-1,n);
        res.right=solve(pre,in,mid+1,e,n);

        return res;

    }

    public TreeNode buildTree(ArrayList<Integer> pre, ArrayList<Integer> in) {
        idx=0;
        int n=pre.size();
        TreeNode root=solve(pre,in,0,n-1,n);

        return root;
    }
}
