package com.example.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Pair{
    int ele;
    int index;
    public Pair(int ele, int index){
        this.ele=ele;
        this.index=index;
    }
}
public class MinimumSwapsRequiredForBTtoBST {
    public static int minSwaps(int n, int[] A) {
        ArrayList<Integer> ino= new ArrayList <>();
        InOrder(ino, A, 0);
        return countSwaps(ino);
    }

    private static void InOrder(ArrayList <Integer> ino, int [] A, int i){
        if(i>=A.length) return;

        InOrder(ino, A, 2*i+1);
        ino.add(A[i]);
        InOrder(ino, A, 2*i+2);

    }

    private static int countSwaps(ArrayList <Integer> ino) {
        int n=ino.size();
        Pair[] arr= new Pair[n];

        for(int i=0; i<n; i++){
            arr[i]=new Pair(ino.get(i), i);
        }

        int c=0;
        //Also Works
        //Arrays.sort(arr, (p1,p2)->p1.ele-p2.ele);
        Arrays.sort(arr, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return Integer.compare(p1.ele, p2.ele);
            }});

        for(int i=0; i<n; i++){

            if(i==arr[i].index){
                continue;
            }
            else{
                c++;
                swap(arr, i, arr[i].index);
                i--;
            }
        }
        return c;
    }

    private static void swap(Pair[] arr, int index1, int index2){

        int tempval=arr[index1].ele;
        int tempind=arr[index1].index;

        arr[index1].ele= arr[index2].ele;
        arr[index1].index=arr[index2].index;

        arr[index2].ele=tempval;
        arr[index2].index=tempind;
    }
}
