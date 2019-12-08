package com.sitric.algorithms.selectionSearch;

import com.sitric.algorithms.api.SearchAlgorithm;

/**
 * Сортировка выборкой
 * Complexity O(n^2)
 *
 * 1. Ищем min значение в списке
 * 2. Делаем обмен со значением первой неотсортированной позиции
 * 3. Сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
 *
 * Инвариант: элементы >= out отсортированы
 */
public class SelectionSearch implements SearchAlgorithm {
    public int[] sort(int[] array) {
        int minIndex;
        for (int out = 0; out < array.length - 1; out++) {
            minIndex = out;
            for (int in = out + 1; in < array.length; in++) {
                if (array[minIndex] > array[in]) {
                    minIndex = in;
                }
                if (out != minIndex) {
                    swap(array, out, minIndex);
                  }
            }
        }
        return array;
    }
}
