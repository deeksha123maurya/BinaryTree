package com.example.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalTraversalOfBinaryTree {
    static class Pair{
        TreeNode node;
        int hd;
        Pair(TreeNode node,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        if(root ==null)
        {
            return ans;
        }
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair curr=q.poll();

            if(map.containsKey(curr.hd))
            {
                map.get(curr.hd).add(curr.node.val);
            }
            else
            {
                ArrayList<Integer>temp=new ArrayList<Integer>();
                temp.add(curr.node.val);
                map.put(curr.hd,temp);
            }

            if(curr.node.left!=null)
            {
                q.add(new Pair(curr.node.left,curr.hd-1));
            }
            if(curr.node.right!=null)
            {
                q.add(new Pair(curr.node.right,curr.hd+1));
            }
        }
        for(int x:map.keySet())
        {
            ArrayList<Integer>f=map.get(x);
            ans.add(f);
        }
        return ans;
    }
}
