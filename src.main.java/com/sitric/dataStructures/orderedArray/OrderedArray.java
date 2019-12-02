package com.sitric.dataStructures.orderedArray;

import java.util.Arrays;

public class OrderedArray {
    private int capacity;
    private int[] orderedArray;
    private int numberOfElements = 0;

    public OrderedArray(int capacity) {
        this.capacity = capacity;
        orderedArray = new int[capacity];
    }

    public void insert(int value) {
        if (capacity < numberOfElements) {
            throw new ArrayIndexOutOfBoundsException("low capacity");
        }
        int i;
        for (i = 0; i < numberOfElements; i++) {
            if (orderedArray[i] > value) {
                break;
            }
        }
        // move elements greater then value
        for (int j = numberOfElements; j > i; j--) {
            orderedArray[j] = orderedArray[j - 1];
        }
        orderedArray[i] = value;
        numberOfElements++;
    }

    public int[] getOrderedArray() {
        return orderedArray;
    }

    @Override
    public String toString() {
        return "OrderedArray{" +
                "capacity=" + capacity +
                ", orderedArray=" + Arrays.toString(orderedArray) +
                ", numberOfElements=" + numberOfElements +
                '}';
    }
}
