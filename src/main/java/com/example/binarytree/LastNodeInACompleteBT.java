package com.example.binarytree;
import java.util.*;
public class LastNodeInACompleteBT {
    public int lastNode(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            ans = temp.val;
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }

        return ans;
    }
}
