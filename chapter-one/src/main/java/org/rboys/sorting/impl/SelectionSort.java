package org.rboys.sorting.impl;

import org.rboys.sorting.api.Sort;

/**
 * @author BitDisciple on 11/1/2023
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] a, SortingMode m) {
        for (int i = 0; i < a.length - 1; i++) {
            int temp = a[i];    // Store the element, that potentially might be swapped, in temporary variable
            int minIndex = i;   // initially we say that current loop iterations i-th element is the smallest in the sub-array
            int j = i + 1;

            while (j < a.length) {
                if (a[j] <= a[minIndex]) {
                    minIndex = j;
                }
                j = j + 1;
            }

            // Swap the elements in the array for the found out minimum index
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

}
