package com.example.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DiagonalTraversal {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> v=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();

            while(temp!=null){
                v.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);

                temp = temp.right;
            }
        }
        return v;
    }
}
