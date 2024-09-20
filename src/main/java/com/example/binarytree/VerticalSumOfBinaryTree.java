package com.example.binarytree;
import java.util.*;
public class VerticalSumOfBinaryTree {
    static int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
    public ArrayList<Integer> verticalSum(TreeNode A) {
        ArrayList<Integer> al=new ArrayList<>();
        max=Integer.MIN_VALUE;min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hs=new HashMap<>();
        pre(A,hs,0);
        for(int i=min;i<=max;i++)
            al.add(hs.get(i));
        return al;
    }
    public static void pre(TreeNode root,HashMap<Integer,Integer> hs,int dep)
    {
        if(root==null)return ;
        if(!hs.containsKey(dep))
            hs.put(dep,root.val);
        else
            hs.put(dep,hs.get(dep)+root.val);
        if(dep>max)
            max=dep;
        if(dep<min)
            min=dep;
        pre(root.left,hs,dep-1);
        pre(root.right,hs,dep+1);
    }
}
