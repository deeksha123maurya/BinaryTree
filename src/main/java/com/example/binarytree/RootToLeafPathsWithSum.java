package com.example.binarytree;

import java.util.ArrayList;

public class RootToLeafPathsWithSum {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();

        findAll(A, 0, B, res, array);

        return res;

    }

    public void findAll(TreeNode node, int curSum, int reqSum, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> array) {

        if (node == null)
            return;

        array.add(node.val);

        if (node.left == null && node.right == null) {
            curSum += node.val;

            if (curSum == reqSum) {
                res.add(new ArrayList(array));
            }

            array.remove(array.size() - 1);

            return;
        }

        curSum += node.val;

        findAll(node.left, curSum, reqSum, res, array);
        findAll(node.right, curSum, reqSum, res, array);

        array.remove(array.size() - 1);//removing it gives error
    }
}
