package com.example.binarytree;

import java.util.HashMap;

public class ConstructTreeFromPostAndIn {
    int idx;
    HashMap<Integer,Integer> hm=new HashMap<>();

    TreeNode solve(int post[],int in[],int s,int e)
    {
        if(s>e || idx<0)
            return null;
        int element = post[idx--];
        TreeNode res=new TreeNode(element);
        if(s==e)
            return res;

        int mid=hm.get(element);

        res.right=solve(post,in,mid+1,e);
        res.left=solve(post,in,s,mid-1);

        return res;

    }
    TreeNode buildTree(int in[], int post[], int n) {
        // Your code here
        idx=n-1;
        for(int i=0;i<n;i++)
        {
            hm.put(in[i],i);
        }

        TreeNode root=solve(post,in,0,n-1);

        return root;

    }
}
