package com.example.binarysearchtree;

public class FindMedianOfBST {
    static BSTNode curr,prev;

    public static void countNodes(BSTNode node,int[] count) {
        //we pass n by reference hence the result is directly stored in it...
        if(node==null) return;
        countNodes(node.left,count);
        count[0]++;
        countNodes(node.right,count);
    }

    public static void mainLogicFunction(BSTNode node, int[] counter, int k, int[] f){
        if(node==null) return;
        mainLogicFunction(node.left, counter, k, f);
        if(prev==null){
            prev = node;
            counter[0]++;
        }
        else if(counter[0]==k){
            counter[0]++;
            curr = node;
            f[0] = 1; //shows that we got element we needed
            return;
        }
        else if(f[0]==0){
            counter[0]++;
            prev = node; //each time we move forward in traversal it makes curr = prev
        }
        mainLogicFunction(node.right, counter, k, f);
    }


    public static float findMedian(BSTNode root)
    {
        // code here.
        int[] count={0}; //no of nodes
        countNodes(root,count);

        curr = null;
        prev = null;

        int[] counter ={1};
        int k = count[0]/2 + 1;
        //this is our flag variable to see if counter == k condition is found or not
        int[]f = {0};

        mainLogicFunction(root, counter, k, f);
        float ans;
        //n is odd
        if(count[0]%2!=0){
            ans = (float)(curr.data); //convert to float
            return ans;
        }
        else {
            ans = (float)(curr.data+prev.data)/2;
            return ans;
        }

        //return ans;
    }
}
