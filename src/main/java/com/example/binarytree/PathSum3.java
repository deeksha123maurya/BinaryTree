package com.example.binarytree;
import java.util.HashMap;
public class PathSum3 {
    int total = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put((long)0, 1);
        findPathSum(root, 0, sum, hm);
        return total;
    }
    private void findPathSum(TreeNode curr, long sum, int target, HashMap<Long, Integer> hm) {
        if (curr == null)
            return;

        sum += curr.val;
        if(hm.containsKey(sum-target))
            total += hm.get(sum-target);
        hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        findPathSum(curr.left, sum, target, hm);
        findPathSum(curr.right, sum, target, hm);
        hm.put(sum, hm.get(sum) - 1);

    }
}
