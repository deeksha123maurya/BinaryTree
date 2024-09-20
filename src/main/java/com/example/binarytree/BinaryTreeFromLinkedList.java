package com.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeFromLinkedList {
    public static TreeNode convert(TreeNode head, TreeNode node) {
        // add code here.}
        if(head == null){
            return null;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        node = new TreeNode(head.val);
        head = head.next;
        q.add(node);

        while(!q.isEmpty()){
            TreeNode cur = q.poll();

            if(head != null){
                cur.left = new TreeNode(head.val);
                head = head.next;
                q.add(cur.left);
            }

            if(head != null){
                cur.right = new TreeNode(head.val);
                head = head.next;
                q.add(cur.right);
            }
        }

        return node;
    }
}
