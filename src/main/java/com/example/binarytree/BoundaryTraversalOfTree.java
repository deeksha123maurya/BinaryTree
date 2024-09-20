package com.example.binarytree;

import java.util.ArrayList;

public class BoundaryTraversalOfTree {
    boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }

    void leftBoundary(TreeNode root, ArrayList<Integer> list){
        TreeNode curr = root.left;

        while(curr != null){
            if(!isLeaf(curr)){
                list.add(curr.val);
            }

            if(curr.left != null){
                curr = curr.left;
            }
            else curr = curr.right;
        }

    }

    void leaves(TreeNode root, ArrayList<Integer> list){
        if(isLeaf(root)) {
            list.add(root.val);
            return;
        }

        if(root.left != null) leaves(root.left, list);
        if(root.right != null) leaves(root.right, list);
    }

    void rightBoundary(TreeNode root, ArrayList<Integer> list){
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();

        while(curr != null){
            if(!isLeaf(curr)) temp.add(curr.val);

            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        for(int i = temp.size()-1; i >= 0 ; i--){
            list.add(temp.get(i));
        }

    }

    ArrayList <Integer> boundary(TreeNode root)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if(isLeaf(root)){
            list.add(root.val);
            return list;
        }

        if(!isLeaf(root)){
            list.add(root.val);
        }

        leftBoundary(root, list);
        leaves(root, list);
        rightBoundary(root, list);

        return list;
    }
}
