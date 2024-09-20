package com.example.binarysearchtree;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceEveryElementWithTheLeastGreaterElementOnItRight {
    static BSTNode succ = null;//Global Element changes its value but local one does not
    public static BSTNode insert(BSTNode node,int data)
    {
        if(node==null)
            return node=new BSTNode(data);

        if(node.data>data)
        {
            succ=node;
            node.left=insert(node.left,data);
        }
        else
        {
            node.right=insert(node.right,data);
        }

        return node;
    }
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        BSTNode root=null;
        for(int i=n-1;i>=0;i--)
        {
            succ=null;
            root=insert(root,arr[i]);
            if(succ!=null)
            {
                ans.add(succ.data);
            }
            else
            {
                ans.add(-1);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
