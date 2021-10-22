package com.company;

public class InsertionSort {

    void InsertionSorting(int array[]) {

        for (int i = 1; i < array.length; ++i) {
            int timeValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > timeValue) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = timeValue;
        }
    }

    void printArray(int array[]) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

}
