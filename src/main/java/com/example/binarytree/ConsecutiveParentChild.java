package com.example.binarytree;
import java.util.*;
public class ConsecutiveParentChild {
    public int consecutiveNodes(TreeNode root) {
        int count=0;

        if(root==null)
            return count;

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int sz=q.size();
            while(sz-->0)
            {
                TreeNode node=q.peek();
                q.poll();
                int a=node.val;

                if(node.left!=null)
                {
                    int b=node.left.val;

                    if(Math.abs(a-b)==1)
                        count++;

                    q.add(node.left);
                }

                if(node.right!=null)
                {
                    int b=node.right.val;

                    if(Math.abs(a-b)==1)
                        count++;

                    q.add(node.right);
                }

            }
        }

        return count;
    }
}
