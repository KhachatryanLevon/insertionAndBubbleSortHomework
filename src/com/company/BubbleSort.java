package com.company;

public class BubbleSort {

    void bubbleSorting(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int timeValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = timeValue;
                }
            }
        }
    }

    void printArray(int array[]) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}

