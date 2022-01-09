package com.company;

import java.util.Arrays;

public class HeapSort {

    public static int heapsize;
    static int count=0;

    public static void HeapSort(int[] A) {
        A=Arrays.copyOf(A, A.length);
        heapsize=A.length - 1;
        Build_Max_Heap(A);

        for (int i=A.length - 1; i > 0; i--) {
            int temp=A[0];
            A[0]=A[i];
            A[i]=temp;
            heapsize--;
            Max_Heapify(A, 0);

        }
        System.out.println("HeapSort: " + "Num" + A.length + "\n" + "Cost to sort " + "Num" + A.length + " = " + count);
        if (A.length <= 64) {
            System.out.println(Arrays.toString(A) + "\n");
        } else {
            System.out.println(Arrays.toString((Arrays.copyOfRange(A, 50, 100))) + "\n");

        }
        count=0;
    }


    private static int left(int i) {
        return 2 * i + 1;
    }

    private static int right(int i) {
        return 2 * i + 2;
    }

    public static void Max_Heapify(int[] A, int i) {
        int l=left(i);
        int r=right(i);
        int largest;
        if (l <= heapsize && A[l] > A[i]) {
            largest=l;
        } else {
            largest=i;
        }

        if (r <= heapsize && A[r] > A[largest]) {
            largest=r;
        }

        if (largest != i) {
            int temp=A[i];
            A[i]=A[largest];
            A[largest]=temp;
            count++;
            Max_Heapify(A, largest);
        }
    }

    public static void Build_Max_Heap(int[] A) {

        for (int i=(A.length / 2) - 1; i >= 0; i--) {
            Max_Heapify(A, i);
        }

    }

}
