package com.sitric.algorithms.binarySearch;

/**
 * BinarySearch in ordered array
 * complexity O(logN)
 */
public class BinarySearch {
    public int find(int[] initArr, int searchNumber) {
        int lowerBound = 0;
        int upperBound = initArr.length - 1;
        int currentIndex;

        while (true) {
            currentIndex = (upperBound + lowerBound) / 2;
            if (initArr[currentIndex] == searchNumber) {
                return currentIndex;
            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (initArr[currentIndex] > searchNumber) {
                    upperBound = currentIndex - 1;
                } else {
                    lowerBound = currentIndex + 1;
                }
            }
        }
    }
}
