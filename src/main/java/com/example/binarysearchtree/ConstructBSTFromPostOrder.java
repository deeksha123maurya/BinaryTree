package com.example.binarysearchtree;

public class ConstructBSTFromPostOrder {
    public static BSTNode constructTree(int post[],int n)
    {
        //Add your code here.
        return bstFromPostorder(post,Integer.MIN_VALUE,new int[]{n-1});
    }
    public static BSTNode bstFromPostorder(int[] A,int bound,int[] i)
    {
        if(i[0]<0 || A[i[0]]<bound)
            return null;
        BSTNode root=new BSTNode(A[i[0]--]);
        root.right=bstFromPostorder(A,root.data,i);
        root.left=bstFromPostorder(A,bound,i);

        return root;
    }
}
