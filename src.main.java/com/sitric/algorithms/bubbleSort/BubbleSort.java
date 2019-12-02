package com.sitric.algorithms.bubbleSort;

/**
 * Bubble sort
 * complexity O(n^2)
 *
 * Инвариант: все элементы после out являются отсортированными
 */
public class BubbleSort {
    public int[] sort(int[] initialArray) {
        for (int out = initialArray.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (initialArray[in] > initialArray[out]) {
                    swap(initialArray, in, out);
                }
            }
        }
        return initialArray;
    }

    private void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}
