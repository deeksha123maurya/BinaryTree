package com.example.binarytree;

/* Class to find size of Binary Tree */
class BinaryTree
{
    TreeNode root;

    /* Given a binary tree. Print its nodes in level order
       using array for implementing queue */
    int size()
    {
        return size(root);
    }

    /* computes number of nodes in tree */
    int size(TreeNode node)
    {
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        NodeAtDistanceKFromRoot tree = new NodeAtDistanceKFromRoot();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        //System.out.println("The size of binary tree is : "
                //+ tree.size());
    }
}
