package com.example.binarytree;

public class SumRootToLeaf {
    private static final int MOD = 1003;

    public int sumNumbers(TreeNode A) {

        return sum(A, 0) % MOD;

    }

    public int sum(TreeNode node, int num) {

        if (node == null)
            return 0;

        if (node.left == null && node.right == null) {
            int newNum = num * 10 + node.val;
            newNum %= MOD;
            return newNum;
        }

        num = num * 10 + node.val;
        num %= MOD;

        int leftSum = sum(node.left, num);
        int rightSum = sum(node.right, num);

        return (leftSum + rightSum) % MOD;

    }
}
