package com.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeExtraSpace {
    public void connect(TreeNode root) {
        // code here
        if(root == null) {
            return ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=1;i<=n;i++) {
                TreeNode curr  = q.poll();
                if(i!=n) {
                    curr.next = q.peek();
                } else {
                    curr.next = null;
                }

                if(curr.left!=null) {
                    q.add(curr.left);
                }
                if(curr.right !=null) {
                    q.add(curr.right);
                }
            }
        }

    }
}
