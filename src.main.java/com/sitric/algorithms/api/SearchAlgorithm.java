package com.sitric.algorithms.api;

/**
 * Базовый интерфейс для алгоритмов сортировки
 */
public interface SearchAlgorithm {
    int[] sort(int[] array);

    default void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}
