package com.example.binarysearchtree;

public class SearchInBST {
    boolean search(BSTNode<Number> root, int x) {
        // Your code here
        while(root != null && root.data != x)
        {
            root=(x<root.data)?root.left:root.right;
        }

        if(root!=null)
            return true;

        return false;
    }
}
