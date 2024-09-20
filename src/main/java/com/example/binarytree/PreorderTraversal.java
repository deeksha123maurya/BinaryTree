package com.example.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
            return ans;

        Stack<TreeNode> st=new Stack<>();
        st.push(root);

        while(!st.isEmpty())
        {
            TreeNode curr=st.pop();
            ans.add(curr.val);

            if(curr.right!=null)
                st.push(curr.right);
            if(curr.left!=null)
                st.push(curr.left);
        }

        return ans;
    }
}
