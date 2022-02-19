package com.example.demo.duplicates;

public class Input {
    public static int[] largeInput = generateIntSequence(100_000_000);

    public static int[] generateIntSequence(int upTo) {
        int[] result = new int[upTo];
        for (int i = 0; i < upTo; i++) {
            result[i] = i;
        }
        return result;
    }
}
