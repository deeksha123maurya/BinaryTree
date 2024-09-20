package com.example.binarysearchtree;

public class PredecessorAndSuccessor {
    public static void findPreSuc(BSTNode<Number> root, int key)
    {
        BSTNode<Number> pre=null,suc=null;
        BSTNode<Number> temp = root;
        while(temp!=null){
            if(temp.data <= key) temp = temp.right;
            else{
                suc = temp;
                temp = temp.left;
            }
        }
        temp = root;
        while(temp!=null){
            if(temp.data >= key) temp = temp.left;
            else{
                pre = temp;
                temp = temp.right;
            }
        }

    }
}
