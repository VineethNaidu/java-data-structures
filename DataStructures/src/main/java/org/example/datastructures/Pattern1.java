package org.example.datastructures;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter N value");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = 1;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(k + " ");
                k += 1;
            }
            System.out.println();
            k += N;
        }
    }
}
