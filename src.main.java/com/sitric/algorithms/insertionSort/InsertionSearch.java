package com.sitric.algorithms.insertionSort;

import com.sitric.algorithms.api.SearchAlgorithm;

/**
 * Сортировка вставкой
 * Complexity O(n^2)
 *
 * Инвариант: элементы слева от граничного являются частично отсортированными
 */
public class InsertionSearch implements SearchAlgorithm {
    public int[] sort(int[] array) {
        int previousIndex;
        int currentIndex;
        for (int i = 1; i < array.length; i++) {
            previousIndex = i - 1;
            currentIndex = i;
            while(previousIndex >= 0 && array[previousIndex] > array[currentIndex]) {
                swap(array, previousIndex, currentIndex);
                previousIndex--;
                currentIndex--;
            }
        }
        return array;
    }
}
