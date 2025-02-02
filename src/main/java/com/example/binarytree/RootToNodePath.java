package com.example.binarytree;
import java.util.*;
public class RootToNodePath {
    static boolean getPath(TreeNode root, ArrayList < Integer > arr, int x) {
        if (root == null)
            return false;

        arr.add(root.val);

        if (root.val == x)
            return true;

        if (getPath(root.left, arr, x) ||
                getPath(root.right, arr, x))
            return true;

        arr.remove(arr.size() - 1);
        return false;
    }

    public ArrayList<Integer> solve(TreeNode root, int x) {

        ArrayList<Integer>ans=new ArrayList<>();

        getPath(root,ans,x);

        return ans;
    }
}

