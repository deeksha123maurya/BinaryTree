package com.example.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigzagTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        while (!q.isEmpty()) {

            int len = q.size();
            ArrayList<Integer> levelResult = new ArrayList<>();

            for (int i = 0; i < len; i++) {

                TreeNode temp = q.poll();

                //If left child is not null
                if (temp.left != null)
                    q.add(temp.left);

                //If right child is not null
                if (temp.right != null)
                    q.add(temp.right);

                if (level % 2 == 0)
                    levelResult.add(temp.val);
                else
                    levelResult.add(0, temp.val);
            }

            level++;
            result.add(levelResult);
        }

        return result;
    }
}
