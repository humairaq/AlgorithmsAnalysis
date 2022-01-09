package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader readText=new BufferedReader(new FileReader("Num8.txt"));
        int[] num8=sortNumArray(readText, 8);
        readText=new BufferedReader(new FileReader("Num16.txt"));
        int[] num16=sortNumArray(readText, 16);
        readText=new BufferedReader(new FileReader("Num32.txt"));
        int[] num32=sortNumArray(readText, 32);
        readText=new BufferedReader(new FileReader("Num64.txt"));
        int[] num64=sortNumArray(readText, 64);
        readText=new BufferedReader(new FileReader("Num128.txt"));
        int[] num128=sortNumArray(readText, 128);
        readText=new BufferedReader(new FileReader("Num256.txt"));
        int[] num256=sortNumArray(readText, 256);
        readText=new BufferedReader(new FileReader("Num512.txt"));
        int[] num512=sortNumArray(readText, 512);
        readText=new BufferedReader(new FileReader("Num1024.txt"));
        int[] num1024=sortNumArray(readText, 1024);
        readText=new BufferedReader(new FileReader("Num2048.txt"));
        int[] num2048=sortNumArray(readText, 2048);
        readText=new BufferedReader(new FileReader("Num4096.txt"));
        int[] num4096=sortNumArray(readText, 4096);
        readText=new BufferedReader(new FileReader("Num8192.txt"));
        int[] num8192=sortNumArray(readText, 8192);
        readText=new BufferedReader(new FileReader("Num16384.txt"));
        int[] num16384=sortNumArray(readText, 16384);

        System.out.println("\n" + "INSERTION SORT" + "\n");
        InsertionSort InsertionSort=new InsertionSort();
        InsertionSort.InsertionSort(num8);
        InsertionSort.InsertionSort(num16);
        InsertionSort.InsertionSort(num32);
        InsertionSort.InsertionSort(num64);
        InsertionSort.InsertionSort(num128);
        InsertionSort.InsertionSort(num256);
        InsertionSort.InsertionSort(num512);
        InsertionSort.InsertionSort(num1024);
        InsertionSort.InsertionSort(num2048);
        InsertionSort.InsertionSort(num4096);
        InsertionSort.InsertionSort(num8192);
        InsertionSort.InsertionSort(num16384);
        readText.close();
        MergeSort MergeSort=new MergeSort();
        System.out.println("MERGE SORT" + "\n");
        MergeSort.MergeSort(num8);
        MergeSort.MergeSort(num16);
        MergeSort.MergeSort(num32);
        MergeSort.MergeSort(num64);
        MergeSort.MergeSort(num128);
        MergeSort.MergeSort(num256);
        MergeSort.MergeSort(num512);
        MergeSort.MergeSort(num1024);
        MergeSort.MergeSort(num2048);
        MergeSort.MergeSort(num4096);
        MergeSort.MergeSort(num8192);
        MergeSort.MergeSort(num16384);

        HeapSort HeapSort=new HeapSort();
        System.out.println("HEAP SORT" + "\n");
        HeapSort.HeapSort(num8);
        HeapSort.HeapSort(num16);
        HeapSort.HeapSort(num32);
        HeapSort.HeapSort(num64);
        HeapSort.HeapSort(num128);
        HeapSort.HeapSort(num256);
        HeapSort.HeapSort(num512);
        HeapSort.HeapSort(num1024);
        HeapSort.HeapSort(num2048);
        HeapSort.HeapSort(num4096);
        HeapSort.HeapSort(num8192);
        HeapSort.HeapSort(num16384);

        QuickSort QuickSort=new QuickSort();
        System.out.println("QUICK SORT" + "\n");
        QuickSort.QuickSort(num8);
        QuickSort.QuickSort(num16);
        QuickSort.QuickSort(num32);
        QuickSort.QuickSort(num64);
        QuickSort.QuickSort(num128);
        QuickSort.QuickSort(num256);
        QuickSort.QuickSort(num512);
        QuickSort.QuickSort(num1024);
        QuickSort.QuickSort(num2048);
        QuickSort.QuickSort(num4096);
        QuickSort.QuickSort(num8192);
        QuickSort.QuickSort(num16384);

    }

    public static int[] sortNumArray(BufferedReader readText, int size) throws NumberFormatException, IOException {
        int[] numArray=new int[size];
        for (int a=0; a < size; a++) {
            numArray[a]=Integer.parseInt(readText.readLine());
        }
        return numArray;
    }


}






