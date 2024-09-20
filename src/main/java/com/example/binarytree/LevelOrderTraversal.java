package com.example.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static ArrayList<Integer> levelOrder(TreeNode root)
    {
        // Your code here
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

                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);

                ans.add(curr.val);
            }

        }

        return ans;
    }
}
