package org.rboys.adding.impl;

import org.rboys.adding.api.Add;

/**
 * Simplest solution for the binary addition which uses conditional checks to update bit and carry values
 * based on the result of the addition.
 * @author BitDisciple on 11/1/2023
 */
public class BinaryIntegersOwn implements Add {

    /**
     * My solution for the binary addition of 2 arrays that contain 1s and 0s.
     */
    @Override
    public int[] add(int[] a, int[] b) {
        int[] binary = new int[a.length];
        int carry = 0;
        int bit;

        for (int i = binary.length - 1; i >= 0; i--) {
            bit = a[i] + b[i] + carry;

            if (bit >= 3) {
                 binary[i] = 1;
                 carry = 1;
            } else if (bit == 2) {
                binary[i] = 0;
                carry = 1;
            } else if (bit == 1) {
                binary[i] = 1;
                carry = 0;
            } else {
                binary[i] = 0;
                carry = 0;
            }
        }

        return binary;
    }
}
