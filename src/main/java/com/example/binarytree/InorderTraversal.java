package com.example.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        TreeNode curr=root;

        while(true)
        {
            if(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            else
            {
                if(st.isEmpty())
                {
                    break;
                }

                curr=st.pop();
                ans.add(curr.val);
                curr=curr.right;
            }
        }

        return ans;
    }
}
