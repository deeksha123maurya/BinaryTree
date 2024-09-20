package com.example.binarytree;

public class BinaryTreeCameras {
    //0 - not monitored
    //1 - monitored
    //2 - has camera
    public int minCameraCover(TreeNode root) {
        int[] count=new int[1];
        if(dfs(root,count)==0)// if root is not monitored, we place an additional camera here
            count[0]++;
        return count[0];
    }

    public int dfs(TreeNode root,int[] count)
    {
        if(root==null)
            return 1;

        int l=dfs(root.left,count);
        int r=dfs(root.right,count);

        // if at least 1 child is not monitored, we need to place a camera at current node
        //else at least 1 child has camera, the current node is monitored. Thus, we don't need to place a camera here
        //if both the child are monitored but have no camera, we don't need to place a camera here. We place the camera at its parent node at the higher level.
        if(l==0 || r==0)
        {
            count[0]++;
            return 2;
        }
        else if(l==2 || r==2)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
