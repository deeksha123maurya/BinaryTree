package com.example.binarysearchtree;

public class MinimumValueInBST {
    public static int minValue(BSTNode<Number> node) {
        // Write your code here.
        if(node==null){
            return -1;
        }
        while(node.left!=null){
            node=node.left;
        }
        return node.data;
    }
}
