package com.example.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;

        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;

        while(curr!=null || !st.isEmpty())
        {
            if(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            else
            {
                TreeNode temp=st.peek().right;
                if(temp==null)
                {
                    temp=st.peek();
                    st.pop();
                    ans.add(temp.val);

                    while(!st.isEmpty() && temp==st.peek().right)
                    {
                        temp=st.peek();
                        st.pop();
                        ans.add(temp.val);
                    }
                }
                else
                    curr=temp;
            }
        }
        return ans;
    }
}
