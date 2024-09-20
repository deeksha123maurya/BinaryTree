package com.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class CoveredOrUncoveredTree {
    public Long coveredNodes(TreeNode A) {

        long uncovered=0;
        long covered=0;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);

        while(!q.isEmpty())
        {
            int sz=q.size();
            for(int i=0; i<sz; i++){
                TreeNode temp = q.remove();
                if(i==0||i==sz-1){
                    uncovered +=temp.val;
                }
                else{
                    covered += temp.val;
                }
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
        }

        return Math.abs(covered-uncovered);
    }
}
