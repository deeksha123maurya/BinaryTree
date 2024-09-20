package com.example.binarytree;

import java.util.*;

public class NodesAtDistanceK {
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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
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

        List<Integer>res=new ArrayList<>();

        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            res.add(curr.val);
        }

        return res;
    }
}
