package org.rboys;

import org.rboys.sorting.InsertionSort;
import org.rboys.sorting.SortingMode;

import java.util.Arrays;

/**
 * @author BitDisciple on ${DATE}
 */
public class Runner {

    public static void main(String[] args) {
        int[] nums1 = {5, 2, 4, 6, 1, 3};
        System.out.println("Before sort: " + Arrays.toString(nums1));
        InsertionSort.sort(nums1, SortingMode.ASCENDING);
        System.out.println("Ascending sort: " + Arrays.toString(nums1));

        System.out.println();

        int[] nums2 = {5, 2, 4, 6, 1, 3};
        System.out.println("Before sort: " + Arrays.toString(nums2));
        InsertionSort.sort(nums2, SortingMode.DESCENDING);
        System.out.println("Descending sort: " + Arrays.toString(nums2));
    }
}