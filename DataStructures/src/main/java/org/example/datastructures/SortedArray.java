package org.example.datastructures;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 8, 9};
        int arr2[] = {1, 2, 2, 3, 3, 5, 6, 7};

        int[] arr = sortedArray(arr1, arr2);

        System.out.println("Sorted Array: ");

        for(int i : arr) {
            System.out.print(i);
        }
    }

    public static int[] sortedArray(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        if(arr1.length == 0) {
            return arr2;
        }

        if(arr2.length == 0) {
            return arr1;
        }

        while(i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                arr3[k++] = arr2[j++];
            } else {
                arr3[k++] = arr1[i++];
                j++;
            }
        }

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr1[j++];
        }
        int[] result = Arrays.copyOf(arr3, k);
        return result;
    }
}
