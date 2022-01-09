package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static int count=0;

    public static void InsertionSort(int[] A) {

        int i, key;
        A=Arrays.copyOf(A, A.length);
        ;

        for (int j=1; j < A.length; j++) {
            key=A[j];
            i=j - 1;

            while (i >= 0 && A[i] >= key) {
                count=count + 1;
                A[i + 1]=A[i];
                i=i - 1;
            }
            A[i + 1]=key;
        }
        System.out.println("InsertionSort: " + "Num" + A.length + "\n" + "Cost to sort " + "Num" + A.length + " = " + count);
        if (A.length <= 64) {
            System.out.println(Arrays.toString(A) + "\n");
        } else {
            System.out.println(Arrays.toString((Arrays.copyOfRange(A, 50, 100))) + "\n");

        }
        count=0;
    }
}


