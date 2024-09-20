package com.example.binarysearchtree;

import java.util.ArrayList;

public class PreOrder {
    public static ArrayList<Integer> preOrder(BSTNode<Number> root)
    {
        // your code here
        ArrayList<Integer> al=new ArrayList<Integer>();



        if(root!=null){

            al.add(root.data);

            al.addAll(preOrder(root.left));

            al.addAll(preOrder(root.right));

        }



        return al;
    }
}
