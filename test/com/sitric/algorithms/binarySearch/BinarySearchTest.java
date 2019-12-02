package com.sitric.algorithms.binarySearch;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BinarySearchTest {

    @Test
    public void binarySearchElementNotFoundTest() {
        int[] testArr = new int[] {10, 20, 30, 40, 50, 60, 70};
        BinarySearch search = new BinarySearch();
        Assert.assertEquals("Element not found",-1, search.find(testArr, 35));
    }

    @Test
    public void binarySearchElementFoundTest() {
        int[] testArr = new int[] {10, 20, 30, 40, 50, 60, 70};
        BinarySearch search = new BinarySearch();
        Assert.assertEquals("Element found (returning index in array)",2, search.find(testArr, 30));
    }

}