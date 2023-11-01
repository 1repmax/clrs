package org.rboys.sorting.impl;

import org.rboys.sorting.api.Sort;

/**
 * @author BitDisciple on 11/1/2023
 */
public class InsertionSort implements Sort {

    /**
     * Performs insertion-sort algorithm based on the CLRS books pseudocode.
     * This method mutates the original array.
     * @param a array to be sorted
     */
    public void sort(int[] a, SortingMode mode) {
        if (mode == SortingMode.ASCENDING) {
            sortAscending(a);
        } else {
            sortDescending(a);
        }

    }

    /**
     * Written in scope of chapter 2 Insertion Sort chapter
     */
    private void sortAscending(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    /**
     * Solution for exercise {@code 2.1-3}
     */
    private void sortDescending(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] < key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

}
