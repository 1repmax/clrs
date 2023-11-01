package org.rboys;

import org.rboys.searching.impl.LinearSearch;
import org.rboys.sorting.impl.InsertionSort;
import org.rboys.sorting.impl.SortingMode;

import java.util.Arrays;

/**
 * @author BitDisciple on ${DATE}
 */
public class Runner {

    public static void main(String[] args) {
        searchTest();
    }

    private static void sortTest() {
        int[] nums1 = {5, 2, 4, 6, 1, 3};
        System.out.println("Before sort: " + Arrays.toString(nums1));
        new InsertionSort()
                .sort(nums1, SortingMode.ASCENDING);
        System.out.println("Ascending sort: " + Arrays.toString(nums1));

        System.out.println();

        int[] nums2 = {5, 2, 4, 6, 1, 3};
        System.out.println("Before sort: " + Arrays.toString(nums2));
        new InsertionSort()
                .sort(nums2, SortingMode.DESCENDING);
        System.out.println("Descending sort: " + Arrays.toString(nums2));
    }

    private static void searchTest() {
        int[] nums = {5, 2, 4, 6, 1, 3};
        System.out.println(new LinearSearch()
                .search(nums, 4)
        );

        System.out.println(new LinearSearch()
                .search(nums, 7)
        );
    }
}