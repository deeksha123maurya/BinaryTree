package com.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode A)
    {
        int level = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty())
        {
            int p = q.size();
            for(int i =0;i<p;i++)
            {
                TreeNode root = q.poll();
                if(root.left==null && root.right==null)
                {
                    return level;
                }
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
            level++;
        }
        return level;
    }
}
