package com.example.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {
    public ArrayList<Integer> solve(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return ans;
        q.add(root);

        while (!q.isEmpty()) {
            int sz = q.size();

            for (int i = 0; i < sz; i++) {
                TreeNode t = q.poll();
                if (i == sz - 1)
                    ans.add(t.val);
                if (t.left != null)
                    q.add(t.left);
                if (t.right != null)
                    q.add(t.right);
            }
        }

        return ans;
    }
}
