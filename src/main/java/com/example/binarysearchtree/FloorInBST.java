package com.example.binarysearchtree;

public class FloorInBST {
    int floor(BSTNode<Number> root, int input) {
        // code here.
        int floor = -1;
        while (root!=null)
        {
            if (root.data == input)
                return input;
            else if (root.data < input)
            {
                floor = root.data;
                root = root.right;

            }
            else
            {
                root = root.left;
            }
        }

        return floor;
    }
}
