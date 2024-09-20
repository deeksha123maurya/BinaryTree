package com.example.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLevelOrder {
    public ArrayList<Integer> solve(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;

        q.offer(root);

        while(!q.isEmpty())
        {

            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();

                if(curr.right!=null)
                    q.offer(curr.right);
                if(curr.left!=null)
                    q.offer(curr.left);

                ans.add(curr.val);
            }

        }

        Collections.reverse(ans);
        return ans;
    }
}
