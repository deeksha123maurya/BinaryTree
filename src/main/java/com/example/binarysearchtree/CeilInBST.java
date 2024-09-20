package com.example.binarysearchtree;

public class CeilInBST {
    int findCeil(BSTNode<Number> root, int input) {
        int ceil = -1;
        while (root!=null)
        {
            if (root.data == input)
                return input;
            else if (root.data < input)
            {
                root = root.right;

            }
            else
            {
                ceil = root.data;
                root = root.left;
            }
        }

        return ceil;
    }
}
