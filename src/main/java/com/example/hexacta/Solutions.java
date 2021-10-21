package com.example.hexacta;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.OptionalInt;


public class Solutions {

    /**
     * This method returns the minimum positive value of the specified array of integers
     *
     * @param A The array param to be specified
     * @return The minimum positive value
     */
    public int solution(int[] A) {
        OptionalInt min = Arrays.stream(A).min();
        OptionalInt max = Arrays.stream(A).max();
        final int MIN_RANGE = -1000000;
        final int MAX_RANGE = 1000000;
        int arrayLength = A.length;

        validateParam(A, MIN_RANGE, MAX_RANGE, arrayLength);

        if (max.getAsInt() < 1) {
            return 1;
        }

        if (min.getAsInt() == max.getAsInt()) {
            if (min.getAsInt() > 0) return min.getAsInt();
        }

        int limit = max.getAsInt() + 1;
        for (int i = 1; i <= limit; i++) {

            if (!contains(i, A)) {
                return i;
            }
        }

        return 0;
    }

    private boolean contains(int num, int[] a) {
        for (int j : a) {

            if (j > 0) {
                if (j == num) return true;
            }
        }
        return false;
    }

    private void validateParam(int[] A, int MIN_RANGE, int MAX_RANGE, int arrayLength) {
        //Length of the array allowed is between 1 and 100.000 as described in the exercise
        if (arrayLength < 1 || arrayLength > 100000) {
            throw new InvalidParameterException("Range allowed for the size of array is >=1 && <= 100.000");
        }

        //Elements of the array needs to be an integer between -1.000.000 and 1.000.000 as described in the exercise
        for (int i : A) {
            if (i < MIN_RANGE || i > MAX_RANGE) {
                throw new InvalidParameterException("Range allowed for elements of the array is  >= -1.000.000 && <= 1.000.000");
            }
        }
    }

}
