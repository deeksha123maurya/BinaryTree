package com.example.binarytree;

import java.util.HashMap;

public class MaximumSumOfNonadjacentNodes {
    static HashMap<TreeNode,Integer> dp=new HashMap<>();
    static int getMaxSum(TreeNode root)
    {
        if(root==null){
            return 0;
        }
        if(dp.containsKey(root)){
            return dp.get(root);
        }
        int inc=root.val;
        if(root.left!=null){
            inc+=getMaxSum(root.left.left);
            inc+=getMaxSum(root.left.right);
        }
        if(root.right!=null){
            inc+=getMaxSum(root.right.left);
            inc+=getMaxSum(root.right.right);
        }
        int exc=getMaxSum(root.left)+getMaxSum(root.right);
        dp.put(root,Math.max(inc,exc));
        return dp.get(root);
    }
}
