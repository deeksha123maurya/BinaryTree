package com.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class NodeAtDistanceKFromRoot {
    TreeNode root;

    void printKDistant(TreeNode node, int k)
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int lvl = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();

            if (lvl == k) {
                for (int i = 0; i < n; i++) {
                    TreeNode tempNode = queue.poll();
                    System.out.print(tempNode.val + " ");
                }
                return;
            }

            for (int i = 0; i < n; i++) {
                TreeNode tempNode = queue.poll();
                if (tempNode.left != null)
                    queue.add(tempNode.left);
                if (tempNode.right != null)
                    queue.add(tempNode.right);
            }
            lvl++;
        }
    }

    public static void main(String args[])
    {
	/* Constructed binary tree is
			1
		/ \
		2	 3
	/ \ /
	4	 5 8
*/
        NodeAtDistanceKFromRoot tree = new NodeAtDistanceKFromRoot();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(8);

        tree.printKDistant(tree.root, 2);
    }

}
