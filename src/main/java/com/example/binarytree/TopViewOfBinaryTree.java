package com.example.binarytree;

import java.util.*;

class TPair {
    TreeNode node;
    int hd;

    public TPair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class TopViewOfBinaryTree {

        static ArrayList<Integer> topView(TreeNode root)
        {
            ArrayList<Integer>ans = new ArrayList<>();
            if(root == null) return ans;
            Map<Integer,Integer> map = new TreeMap<>();
            Queue<TPair> q = new LinkedList<TPair>();
            q.add(new TPair(root,0));

            while(!q.isEmpty()){
                TPair it = q.poll();
                int hd = it.hd;
                TreeNode temp = it.node;
                if(map.get(hd)==null) map.put(hd,temp.val);
                if(temp.left!=null) q.add(new TPair(temp.left,hd-1));
                if(temp.right!=null) q.add(new TPair(temp.right,hd+1));
            }
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                ans.add(entry.getValue());
            }
            return ans;
        }
}

