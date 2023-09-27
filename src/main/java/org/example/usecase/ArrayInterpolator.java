package org.example.usecase;

import org.example.protocols.Interpolator;

public class ArrayInterpolator {
    @Override
    public int[] interpolateArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Os arrays devem ter o mesmo tamanho para interpolação.");
        }

        return []
    }
}