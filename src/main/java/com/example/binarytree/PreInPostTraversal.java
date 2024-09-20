package com.example.binarytree;

import java.util.*;
class PIPPair {
    TreeNode node;
    int num;
    PIPPair(TreeNode _node, int _num) {
        num = _num;
        node = _node;
    }
}

public class PreInPostTraversal {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        if (root == null) return ans;

        Stack<PIPPair> st = new Stack<PIPPair>();
        st.push(new PIPPair(root, 1));

        while (!st.isEmpty()) {
            PIPPair it = st.pop();

            // this is part of pre
            // increment 1 to 2
            // push the left side of the tree
            if (it.num == 1) {
                pre.add(it.node.val);
                it.num++;
                st.push(it);

                if (it.node.left != null) {
                    st.push(new PIPPair(it.node.left, 1));
                }
            }

            // this is a part of in
            // increment 2 to 3
            // push right
            else if (it.num == 2) {
                in.add(it.node.val);
                it.num++;
                st.push(it);

                if (it.node.right != null) {
                    st.push(new PIPPair(it.node.right, 1));
                }
            }
            // don't push it back again
            else {
                post.add(it.node.val);
            }
        }

        ans.add(in);
        ans.add(pre);
        ans.add(post);

        return ans;
    }
}
