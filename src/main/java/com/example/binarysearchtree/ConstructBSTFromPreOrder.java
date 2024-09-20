package com.example.binarysearchtree;

public class ConstructBSTFromPreOrder {
    public BSTNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    public BSTNode bstFromPreorder(int[] A,int bound,int[] i)
    {
        if(i[0]==A.length || A[i[0]]>bound)
            return null;
        BSTNode root=new BSTNode(A[i[0]++]);
        root.left=bstFromPreorder(A,root.data,i);
        root.right=bstFromPreorder(A,bound,i);

        return root;
    }
}
