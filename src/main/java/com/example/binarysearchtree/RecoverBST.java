package com.example.binarysearchtree;
import java.util.*;
public class RecoverBST {
    private BSTNode first,middle,last,prev;

    private void inorder(BSTNode root)
    {
        if(root==null)
            return;
        inorder(root.left);

        if(prev!=null && root.data<prev.data)
        {
            if(first==null)
            {
                first=prev;
                middle=root;
            }
            else
            {
                last=root;
            }
        }

        prev=root;
        inorder(root.right);
    }
    public ArrayList<Integer> recoverTree(BSTNode root) {
        first=middle=last=null;
        prev=new BSTNode(Integer.MIN_VALUE);
        inorder(root);
        ArrayList<Integer> ans=new ArrayList<>();
        if(first!=null && last!=null)
        {
            int t=first.data;
            first.data=last.data;
            last.data=t;

            ans.add(first.data);
            ans.add(last.data);
        }
        else if(first!=null && middle!=null)
        {
            int t=first.data;
            first.data=middle.data;
            middle.data=t;

            ans.add(first.data);
            ans.add(middle.data);
        }

        return ans;
    }
}
