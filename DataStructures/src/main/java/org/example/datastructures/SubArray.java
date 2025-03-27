package org.example.datastructures;

import java.util.ArrayList;

public class SubArray {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
        int i, j, k, n=A.size();
        for(i=0; i<n; i++){
            for(j=i; j<n; j++){
                ArrayList<Integer> arr1 = new ArrayList<>();
                for(k=i; k<=j; k++) {
                    arr1.add(A.get(k));
                }
                arr2.add(arr1);
            }
        }
        return arr2;
    }

}
