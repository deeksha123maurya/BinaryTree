package com.example.binarytree;

import java.util.ArrayList;

public class CountAllKSumPaths {
    int count=0;
    void solve(TreeNode root, int k, ArrayList<Integer> path)
    {
        if(root==null)
            return;

        path.add(root.val);

        int sum=0;

        for(int i=path.size()-1;i>=0;i--)
        {
            sum+=path.get(i);
            if(sum == k){
                count++;
            }
        }

        solve(root.left,k,path);
        solve(root.right,k,path);
        path.remove(path.size()-1);
    }
    public int sumK(TreeNode root,int k)
    {
        // code here
        ArrayList<Integer> path = new ArrayList<>();
        solve(root , k, path);
        return count;
    }
}
