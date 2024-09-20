package com.example.binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class NodesAtDistanceTypeQuesBurnATree {
    static TreeNode target;

    public static void find_node(TreeNode root, int target_value) {
        if (root == null) return;
        if (root.val == target_value) {
            target = root;
            return;
        }
        find_node(root.left, target_value);
        find_node(root.right, target_value);
    }

    public static void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parent_track) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Iterate over all nodes
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Assign parents to left child and right child if they exist
            if (current.left != null) {
                parent_track.put(current.left, current);
                queue.add(current.left);
            }

            if (current.right != null) {
                parent_track.put(current.right, current);
                queue.add(current.right);
            }
        }
    }

    public static int minTime(TreeNode root, int src) {
        // Your code goes here
        if (root == null)
            return 0;

        find_node(root, src);

        HashMap<TreeNode, TreeNode> parent_track = new HashMap<>();
        markParents(root, parent_track);

        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(target);
        visited.put(target, true);
        int time = 0;

        while (!q.isEmpty()) {
            int sz = q.size();
            int fl = 0;

            for (int i = 0; i < sz; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null && !visited.containsKey(curr.left)) {
                    fl = 1;
                    q.offer(curr.left);
                    visited.put(curr.left, true);
                }

                if (curr.right != null && !visited.containsKey(curr.right)) {
                    fl = 1;
                    q.offer(curr.right);
                    visited.put(curr.right, true);
                }

                if (parent_track.containsKey(curr) && !visited.containsKey(parent_track.get(curr))) {
                    fl = 1;
                    q.offer(parent_track.get(curr));
                    visited.put(parent_track.get(curr), true);
                }
            }

            if (fl == 1)
                time++;
        }


        return time;
    }
}