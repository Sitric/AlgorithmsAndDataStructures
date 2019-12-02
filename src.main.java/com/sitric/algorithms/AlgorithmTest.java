package com.sitric.algorithms;

import com.sitric.algorithms.binarySearch.BinarySearch;
import com.sitric.algorithms.bubbleSort.BubbleSort;
import com.sitric.dataStructures.orderedArray.OrderedArray;

import java.util.Arrays;

public class AlgorithmTest {
    public static void main(String[] args) {
        OrderedArray array = new OrderedArray(10);
        array.insert(30);
        array.insert(10);
        array.insert(60);
        array.insert(20);
        array.insert(40);
        array.insert(50);
        array.insert(80);
        System.out.println(array.toString());

        BinarySearch search = new BinarySearch();
        System.out.println(search.find(array.getOrderedArray(), 30));
        int[] initialArray = new int[] {5, 1, 14, 8, 66, 2, 18, 79, 62, 31};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(initialArray)));
    }
}
