package com.example.binarytree;

import java.util.*;

public class NodesAtDistanceKAtIntegerSource {
    TreeNode target;
    public void find_node(TreeNode root, int target_value){
        if(root == null) return;
        if(root.val == target_value)
        {
            target = root;
            return;
        }
        find_node(root.left, target_value);
        find_node(root.right, target_value);
    }
    public static void markParents(TreeNode root, Map<TreeNode,TreeNode> parent_track)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Iterate over all nodes
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Assign parents to left child and right child if they exist
            if (current.left != null) {
                parent_track.put(current.left, current);
                queue.add(current.left);
            }

            if (current.right != null) {
                parent_track.put(current.right, current);
                queue.add(current.right);
            }
        }
    }

    public ArrayList<Integer> distanceK(TreeNode root, int src, int k) {
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)
            return res;

        find_node(root, src);

        HashMap<TreeNode,TreeNode> parent_track=new HashMap<>();
        markParents(root,parent_track);

        HashMap<TreeNode,Boolean>visited=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();

        q.offer(target);
        visited.put(target,true);
        int level=0;

        while(!q.isEmpty())
        {
            int sz=q.size();
            if(level==k)
                break;

            level++;

            for(int i=0;i<sz;i++)
            {
                TreeNode curr=q.poll();

                if(curr.left!=null && !visited.containsKey(curr.left))
                {
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }

                if(curr.right!=null && !visited.containsKey(curr.right))
                {
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }

                if(parent_track.containsKey(curr) && !visited.containsKey(parent_track.get(curr)))
                {
                    q.offer(parent_track.get(curr));
                    visited.put(parent_track.get(curr),true);
                }
            }
        }


        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            res.add(curr.val);
        }

        return res;
    }
}
