package com.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class KthAncestorOfANode {
    int num_node=0;
    public int kthAncestor(TreeNode root, int k, int node)
    {
        //Write your code here
        length(root);

        int[] parent=new int[num_node+1];

        fill_parent(root,parent);
        int count=0;

        while(node!=-1)
        {
            node=parent[node];
            count++;
            if(count==k)
                return node;
        }

        return -1;
    }

    public void length(TreeNode root)
    {
        if(root==null)return;
        length(root.left);
        num_node++;
        length(root.right);
    }

    public void fill_parent(TreeNode root,int[] parent)
    {
        parent[root.val]=-1;

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            TreeNode temp=q.poll();

            if(temp.left!=null){
                q.offer(temp.left);
                parent[temp.left.val]=temp.val;
            }

            if(temp.right!=null){
                q.offer(temp.right);
                parent[temp.right.val]=temp.val;
            }
        }

    }
}
