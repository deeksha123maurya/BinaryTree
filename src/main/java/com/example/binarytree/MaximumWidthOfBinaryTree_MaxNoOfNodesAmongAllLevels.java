package com.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree_MaxNoOfNodesAmongAllLevels{
    int getMaxWidth(TreeNode root) {
        // Your code here

        // code here
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int maxWidth = 0;
        while(!queue.isEmpty()){
            int n = queue.size();
            maxWidth = Math.max(maxWidth,n);
            for(int i=0;i<n;i++){
                TreeNode temp = queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
        return maxWidth;

    }
}
