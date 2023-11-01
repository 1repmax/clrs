package org.rboys.searching.impl;

import org.rboys.searching.api.Search;

/**
 * @author BitDisciple on 11/1/2023
 */
public class LinearSearch implements Search {

    public int search(int[] a, int o) {
        int key = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == o) key = i;
        }
        return key;
    }
}
