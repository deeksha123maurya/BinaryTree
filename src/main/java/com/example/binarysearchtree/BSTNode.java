package com.example.binarysearchtree;

public class BSTNode<I extends Number> {
    int data;
    BSTNode<Number> left,right,next;
    BSTNode(int d)
    {
        data=d;
        left=right=next=null;
    }
}
