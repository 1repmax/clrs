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
        for (int i = 0; i < a.length; i++) {
            int key = a[i];     // key variable holds the value of the element that needs to be put in correct place in the sub-array
            int j = i - 1;      // iterator specifies that we want to start comparing the fetched key with the elements
                                // that are before it in the sub-array

            while (j >= 0 && a[j] > key) {  //We want to iterate through the sub-array and compare elements in the sub-array with the fetched key
                a[j + 1] = a[j];            // if while condition evaluated to true, we move the element at current index j
                                            // by one position ahead since we know we will have to insert our key before it
                j = j - 1;
            }
            a[j + 1] = key; // At the end of the for loop iteration, the iterator j has index of the lowest position it had to evaluate
                            // To put key in the correct place in sub-array we have to increment the j iterator by 1
        }
    }
}
