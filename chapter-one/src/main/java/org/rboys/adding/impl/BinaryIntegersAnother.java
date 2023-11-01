package org.rboys.adding.impl;

import org.rboys.adding.api.Add;

/**
 * Another implementation of the binary addition which uses modulo division operators instead to update
 * the bit and carry values.
 * @author BitDisciple on 11/1/2023
 */
public class BinaryIntegersAnother implements Add {

    @Override
    public int[] add(int[] a, int[] b) {
        int[] binary = new int[a.length];
        int carry = 0;
        int bit;

        for (int i = binary.length - 1; i >= 0; i--) {
            bit = (a[i] + b[i] + carry) % 2;
            carry = (a[i] + b[i] + carry) / 2;
            binary[i] = bit;
        }

        return binary;
    }
}
