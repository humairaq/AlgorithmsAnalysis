package com.company;


import java.util.Arrays;


public class MergeSort {

    public static int count=0;

    public static void MergeSort(int[] A) {
        A=Arrays.copyOf(A, A.length);
        mergeSort(A, 0, A.length - 1);
        System.out.println("MergeSort: " + "Num" + A.length + "\n" + "Cost to sort " + "Num" + A.length + " = " + count);
        if (A.length <= 64) {
            System.out.println(Arrays.toString(A) + "\n");
        } else {
            System.out.println(Arrays.toString((Arrays.copyOfRange(A, 50, 100))) + "\n");

        }
        count=0;
    }

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q=(p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int n1=(q - p) + 2;
        int n2=(r - q) + 1;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for (int i=0; i < n1 - 1; i++) {
            L[i]=A[p + i];
        }
        for (int i=0; i < n2 - 1; i++) {
            R[i]=A[q + i + 1];
        }
        L[L.length - 1]=Integer.MAX_VALUE;
        R[R.length - 1]=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        for (int k=p; k <= r; k++) {
            count++;
            if (L[i] <= R[j]) {
                A[k]=L[i];
                i++;
            } else {
                A[k]=R[j];
                j++;
            }
        }
    }
}