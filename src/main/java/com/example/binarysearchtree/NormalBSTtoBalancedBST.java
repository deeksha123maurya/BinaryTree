package com.example.binarysearchtree;

import java.util.ArrayList;

public class NormalBSTtoBalancedBST {
    BSTNode buildBalancedTree(BSTNode root)
    {
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);
        BSTNode ans=normalToBalanced(list,0,list.size()-1);
        return ans;
    }

    void inorder(BSTNode root,ArrayList<Integer>list)
    {
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    BSTNode normalToBalanced(ArrayList<Integer> list, int start, int end)
    {
        if(start>end)
            return null;
        int mid=start+(end-start)/2;
        BSTNode root=new BSTNode(mid);
        root.left=normalToBalanced(list,start,mid-1);
        root.right=normalToBalanced(list,mid+1,end);
        return root;

    }
}
