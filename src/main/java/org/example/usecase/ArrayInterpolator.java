package org.example.usecase;

import org.example.protocols.Interpolator;

public class ArrayInterpolator {
    @Override
    public int[] interpolateArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Os arrays devem ter o mesmo tamanho para interpolação.");
        }

        int[] result = new int[array1.length * 2];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            result[index++] = array1[i];
            result[index++] = array2[i];
        }

        return result;
    }
}