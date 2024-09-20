package com.example.binarytree;

import java.util.*;

class BPair {
    TreeNode node;
    int hd;

    public BPair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
public class BottomViewOfBinaryTree {

        public ArrayList <Integer> bottomView(TreeNode root)
        {
            // Code here
            ArrayList<Integer> ans = new ArrayList<>();
            if(root == null) return ans;
            Map<Integer,Integer> map = new TreeMap<>();
            Queue<BPair> q = new LinkedList<BPair>();
            q.add(new BPair(root,0));

            while(!q.isEmpty()){
                BPair it = q.poll();
                int hd = it.hd;
                TreeNode temp = it.node;
                map.put(hd,temp.val);
                if(temp.left!=null) q.add(new BPair(temp.left,hd-1));
                if(temp.right!=null) q.add(new BPair(temp.right,hd+1));
            }
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                ans.add(entry.getValue());
            }
            return ans;
        }
}

