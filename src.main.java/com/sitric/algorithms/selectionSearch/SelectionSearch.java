package com.sitric.algorithms.selectionSearch;

/**
 * Сортировка выборкой
 * Complexity O(n^2)
 *
 * 1. ищем min значение в списке
 * 2. делаем обмен со значением первой неотсортированной позиции
 * 3. сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
 *
 * Инвариант: элементы >= out отсортированы
 */
public class SelectionSearch {
    public int[] find(int[] array) {
        int minIndex;
        int temp;
        for (int out = 0; out < array.length - 1; out++) {
            minIndex = out;
            for (int in = out + 1; in < array.length; in++) {
                if (array[minIndex] > array[in]) {
                    minIndex = in;
                }
                if (out != minIndex) {
                  temp = array[out];
                  array[out] = array[minIndex];
                  array[minIndex] = temp;
                }
            }
        }
        return array;
    }
}
