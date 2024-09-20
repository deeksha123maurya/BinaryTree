package com.example.binarysearchtree;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeToBST {
    BSTNode binaryTreeToBST(BSTNode root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        filllist(root,list);
        Collections.sort(list);
        changeBT(root,list);
        return root;
    }
    void filllist(BSTNode root,ArrayList<Integer> list)
    {
        if(root==null)
            return;
        filllist(root.left,list);
        list.add(root.data);
        filllist(root.right,list);
    }
    void changeBT(BSTNode root, ArrayList<Integer> list)
    {
        if(root==null)
            return;
        changeBT(root.left,list);
        root.data=list.get(0);
        list.remove(0);
        changeBT(root.right,list);
    }
}
