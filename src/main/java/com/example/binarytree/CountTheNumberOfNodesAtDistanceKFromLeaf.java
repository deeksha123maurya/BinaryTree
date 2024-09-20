package com.example.binarytree;

import java.util.Arrays;

public class CountTheNumberOfNodesAtDistanceKFromLeaf {
    int ctr;
    boolean visited[] = new boolean[100001];
    public void kDistantFromLeafUtil(TreeNode root, int count, int k)
    {
        //base case
        if (root == null) return;

        visited[count] = false;

        //if itâ€™s a leaf node, we increment the count but only if the
        //same ancestor at distance k is not already counted.
        if (root.left == null && root.right == null &&
                count-k >= 0 && visited[count-k] == false)
        {
            ctr++;
            //setting the ancestor as visited so that we won't count it again.
            visited[count-k] = true;
            return;
        }

        //if the current node is not a leaf node then we call the function
        //recursively for left and right subtrees.
        kDistantFromLeafUtil(root.left, count+1, k);
        kDistantFromLeafUtil(root.right, count+1, k);

    }
    int printKDistantfromLeaf(TreeNode root, int k)
    {
        // Write your code here
        if(root==null || k<0)
            return 0;

        ctr = 0;
        Arrays.fill(visited, false);

        kDistantFromLeafUtil(root, 0, k);
        //returning the count.
        return ctr;
    }

}
