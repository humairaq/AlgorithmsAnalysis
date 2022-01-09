package com.company;

import java.util.Arrays;

public class QuickSort {
    public static int count=0;

    public static void QuickSort(int[] A) {
        A=Arrays.copyOf(A, A.length);
        QuickSort(A, 0, A.length - 1);
        System.out.println("Quicksort on " + "Num" + A.length + "\n" + "Cost to sort " + "Num" + A.length + " = " + count);
        if (A.length <= 64) {
            System.out.println(Arrays.toString(A) + "\n");
        } else {
            System.out.println(Arrays.toString((Arrays.copyOfRange(A, 50, 100))) + "\n");

        }
        count=0;
    }


    public static void QuickSort(int[] A, int p, int r) {
        if (p < r) {
            int q=Partition(A, p, r);
            QuickSort(A, p, q - 1);
            QuickSort(A, q + 1, r);
        }


    }

    public static int Partition(int[] A, int p, int r) {
        int x=A[r];
        int i=(p - 1);

        for (int j=p; j <= (r - 1); j++) {
            count++;
            if (A[j] <= x) {
                i=i + 1;

                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        int tempTwo=A[i + 1];
        A[i + 1]=A[r];
        A[r]=tempTwo;
        return (i + 1);
    }

}