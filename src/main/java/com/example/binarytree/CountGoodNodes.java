package com.example.binarytree;

public class CountGoodNodes {
    public int goodNodes(TreeNode root) {
        int[] count = new int[]{0};
        helper(root, count, Integer.MIN_VALUE);
        return count[0];
    }
    private void helper(TreeNode root, int[] count, int max){
        if(root.val >= max){
            count[0]++;
        }
        if(root.left != null){
            helper(root.left, count, Math.max(max, root.val));
        }
        if(root.right != null){
            helper(root.right, count, Math.max(max, root.val));
        }
    }
}
