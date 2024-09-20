package com.example.binarytree;

import java.util.ArrayList;

public class InorderTraversalOfCartesianTree {
    public TreeNode buildTree(ArrayList<Integer> A, int s, int e)
    {
        if(s>e)
            return null;

        int ind=-1,maxi=Integer.MIN_VALUE;

        for(int i=s;i<=e;i++)
        {
            if(maxi<A.get(i))
            {
                maxi=A.get(i);
                ind=i;
            }
        }

        TreeNode root=new TreeNode(A.get(ind));

        root.left=buildTree(A,s,ind-1);
        root.right=buildTree(A,ind+1,e);

        return root;
    }
    public TreeNode buildTree(ArrayList<Integer> A) {

        return buildTree(A,0,A.size()-1);
    }
}
