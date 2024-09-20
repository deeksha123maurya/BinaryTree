package com.example.binarytree;
import java.util.*;

public class DuplicateSubtree {
    int dupSub(TreeNode root) {
        // code here
        Map<String, Integer> map = new HashMap<String, Integer>();
        int[] ans = new int[1];
        solve(map, ans, root);
        return ans[0];
    }

    String solve(Map<String, Integer> map, int[] ans, TreeNode root) {
        if (root == null) {
            return "#";
        }
        if (root.left == null && root.right == null) {
            return Integer.toString(root.val);
        }
        String a = solve(map, ans, root.left) +','+ solve(map, ans, root.right) +','+ Integer.toString(root.val);
        map.put(a, map.getOrDefault(a, 0) + 1);
        if (map.getOrDefault(a, 0) > 1) {
            ans[0] = 1;
        }


        return a;
    }
}
