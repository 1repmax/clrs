package org.rboys;

import org.rboys.sorting.InsertionSort;
import org.rboys.sorting.SortingMode;

import java.util.Arrays;

/**
 * @author BitDisciple on ${DATE}
 */
public class Runner {

    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 6, 1, 3};
        System.out.println("Before sort: " + Arrays.toString(nums));
        InsertionSort.sort(nums, SortingMode.ASCENDING);
        System.out.println("After sort: " + Arrays.toString(nums));
    }
}