package com.amg.ar.utils;

public class MathUtils {

    public static int randomize(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
