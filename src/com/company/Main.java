package com.company;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {24, 654, 897, 45, 2, 6, 6, 335, 48, 312, 8};
        bubbleSort.bubbleSorting(array);
        bubbleSort.printArray(array);

        System.out.println();

        InsertionSort insertionSort = new InsertionSort();
        int[] array2 = {56468, 2013, 654, 21, 874, 6, 68, 1, 6, -5, 68, 9};
        insertionSort.InsertionSorting(array2);
        insertionSort.printArray(array2);
    }
}
