package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {4, 10, 3, 5, 1};
        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        heapSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int leftChildIdx = 2 * i + 1;
        int rightChildIdx = 2 * i + 2;
        if (leftChildIdx < n && array[leftChildIdx] > array[largest])
            largest = leftChildIdx;
        if (rightChildIdx < n && array[rightChildIdx] > array[largest])
            largest = rightChildIdx;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, n, largest);
        }
    }

}