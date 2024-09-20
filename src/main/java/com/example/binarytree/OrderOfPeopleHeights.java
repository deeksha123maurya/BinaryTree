package com.example.binarytree;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderOfPeopleHeights {
    public ArrayList<Integer> order(ArrayList<Integer> height, ArrayList<Integer> infront) {
        int n=height.size();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=height.get(i);
            arr[i][1]=infront.get(i);
        }
        //[5,0][3,1][2,2][6,0][1,3][4,2]
        Arrays.sort(arr,(x, y)->x[0]==y[0]?x[1]-y[1]:y[0]-x[0]);

        //[6,0][5,0][4,2][3,1][2,2][1,3]
        //[5,0][3,1][2,2][1,3][6,0][4,2]
        ArrayList<Integer> ans=new ArrayList<>();
        for(int[] a:arr) ans.add(a[1],a[0]);//[0,5][1,3][2,2][3,1][0,6][2,4]

        return ans;
    }
}
