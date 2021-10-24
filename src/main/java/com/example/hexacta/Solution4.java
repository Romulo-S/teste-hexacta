package com.example.hexacta;

import java.util.Arrays;

public class Solution4 {

    public void printIntersection(int[] setA, int[] setB) {
        if (setA != null && setB != null) {
            Arrays.sort(setA);
            Arrays.sort(setB);
            int[] commonSet;

            commonSet = Arrays.stream(setA)
                    .distinct()
                    .filter(x -> Arrays.stream(setB).anyMatch(y -> y == x))
                    .toArray();

            for (int k = 0; k < commonSet.length; k++) {
                System.out.print(commonSet[k] + " ");
            }
        }
    }
}
