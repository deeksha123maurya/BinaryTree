package com.example.binarysearchtree;

public class NextGreaterElementFromGivenNode {
    public BSTNode getSuccessor(BSTNode root, int x) {
        BSTNode num=null;
        while(root!=null){
            if(root.data>x){
                num=root;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return num;
    }
}
