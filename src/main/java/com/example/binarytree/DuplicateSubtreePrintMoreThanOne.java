package com.example.binarytree;
import java.util.*;
public class DuplicateSubtreePrintMoreThanOne {
    String solve(Map<String,Integer> map,List<TreeNode>ans,TreeNode root) {
        if (root == null) {
            return "#";
        }
        /*if (root.left == null && root.right == null) {
            return Integer.toString(root.data);
        }*/
        //Leaf node case is not considered bc it will never reach to last node and print it
        String a = solve(map,ans,root.left) +','+ solve(map,ans,root.right)+','+String.valueOf(root.val);
        map.put(a, map.getOrDefault(a, 0) + 1);
        if (map.getOrDefault(a, 0)==2) {
            ans.add(root);
        }
        return a;
    }
    public List<TreeNode> printAllDups(TreeNode root)
    {
        //code here
        Map<String,Integer> map = new HashMap<>();
        List<TreeNode> ans = new ArrayList<>();
        solve(map,ans,root);
        Collections.sort(ans, (n1, n2) -> Integer.compare(n1.val, n2.val));
        return ans;
    }
}
