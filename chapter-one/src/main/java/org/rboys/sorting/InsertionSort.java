package org.rboys.sorting;

/**
 * @author BitDisciple on 11/1/2023
 */
public class InsertionSort {

    /**
     * Performs insertion-sort algorithm based on the CLRS books pseudocode.
     * This method mutates the original array.
     * @param a array to be sorted
     */
    public static void sort(int[] a, SortingMode mode) {
        if (mode == SortingMode.ASCENDING) {
            sortAscending(a);
        } else {
            sortDescending(a);
        }

    }

    private static void sortAscending(int[] a) {
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

    private static void sortDescending(int[] a) {
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
