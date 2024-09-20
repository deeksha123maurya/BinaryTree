package com.example.binarytree;

import java.util.HashMap;
import java.util.Map;

public class MakeBinaryTreeFromParentArray {
    public static TreeNode createTree(int parent[], int N)
    {
        //Your code here
        Map<Integer,TreeNode> map = new HashMap<>();
        TreeNode root = null;

        for(int i = 0; i < N; i++){
            if(parent[i] == -1){
                root = new TreeNode(i);
                map.put(i,root);
            } else {
                TreeNode temp = new TreeNode(i);
                map.put(i,temp);
            }
        }

        for(int i = 0; i < N; i++){

            if(parent[i] == -1){
                continue;
            } else {
                TreeNode temp = map.get(parent[i]);
                if(temp.left == null){
                    temp.left = map.get(i);
                } else {
                    temp.right = map.get(i);
                }
            }
        }

        return root;
    }
}
