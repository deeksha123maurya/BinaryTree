package com.example.binarysearchtree;

public class SortedArrayToBST {
    public BSTNode sortedArrayToBST(int[] nums) {
        BSTNode root = buildTree(nums, 0, nums.length);
        return root;
    }

    private BSTNode buildTree(int []nums, int low, int high){
        if (low >= high){
            return null;
        }
        int mid = low+(high-low) / 2;
        BSTNode root = new BSTNode(nums[mid]);
        root.left = buildTree(nums, low, mid);
        root.right = buildTree(nums,  mid+ 1, high);
        return root;
    }
}
