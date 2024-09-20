package com.example.binarysearchtree;

public class LevelOrderTraversalToBST {
    static BSTNode insert(BSTNode root,int key){
        if(root==null) return new BSTNode<>(key);
        if(root.data<key)
            root.right=insert(root.right,key);
        else
            root.left=insert(root.left,key);
        return root;
    }
    public BSTNode constructBST(int[] arr)
    {
        //Write your code here
        BSTNode node =new BSTNode<>(arr[0]);
        for(int i=1;i<arr.length;i++){
            insert(node,arr[i]);
        }
        return node;
    }
}
