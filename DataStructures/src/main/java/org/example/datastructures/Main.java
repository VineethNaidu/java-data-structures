package org.example.datastructures;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Hello World");
        int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        moveZeroes(nums);
        ArrayList<ArrayList<Integer>> subArrayList = SubArray.solve(list);
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nSubArrays of an Array!");
        for (ArrayList<Integer> integers : subArrayList) {
            System.out.println(integers);
        }

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        //Print Spiral Matrix
        SpiralMatrix.printSpiralMatrix(matrix);

        int a = 10;
        switch(a) {
            case 0: System.out.println("0 is printed");
                    break;
            case 1: System.out.println("1 is printed");
                    break;
            case 2: System.out.println("2 is printed");
                    break;
            default: System.out.println("Default statement printed!");
        }
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while(j < nums.length) {
            if(nums[i] == 0 && nums[j] == 0) {
                j += 1;
            }
            else if(nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 1;
                j += 1;
            }
            else {
                i += 1;
                j += 1;
            }
        }
    }
}
