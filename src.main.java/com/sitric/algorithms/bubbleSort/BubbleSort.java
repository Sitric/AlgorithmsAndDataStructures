package com.sitric.algorithms.bubbleSort;

import com.sitric.algorithms.api.SearchAlgorithm;

/**
 * Bubble sort
 * complexity O(n^2)
 *
 * Инвариант: все элементы после out являются отсортированными
 */
public class BubbleSort implements SearchAlgorithm {
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
}
