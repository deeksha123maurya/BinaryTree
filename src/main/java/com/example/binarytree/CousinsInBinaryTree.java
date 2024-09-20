package com.example.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> res=new ArrayList<>();

        if(A==null)return res;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(A);
        boolean flag=true;
        while(!q.isEmpty() && flag)
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();

                if(curr.left!=null && curr.left.val==B || curr.right!=null && curr.right.val==B)
                {
                    flag=false;
                }
                else
                {
                    if(curr.left!=null)
                        q.offer(curr.left);
                    if(curr.right!=null)
                        q.offer(curr.right);
                }
            }
        }

        while(!q.isEmpty())
        {
            res.add(q.remove().val);
        }

        return res;
    }
}
