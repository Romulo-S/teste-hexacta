package com.example.hexacta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {


    /**
     * This method returns an array containing the pairs that added, results in x
     *
     * @param A An ordered array
     * @param x The value of the addition result
     * @return
     */
    public List<int[]> solution2(int[] A, int x) {

        List<int[]> result = new ArrayList<>();

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            int value1 = A[i];
            for (int j = 0; j < A.length; j++) {
                int value2 = A[j];
                if (value1 + value2 == x) {
                    int[] matchedResult = {value1, value2};
                    if (isDuplicatePair(result, matchedResult)) {
                        break;
                    }
                    result.add(matchedResult);
                    break;
                }
            }
        }
        return result;
    }

    private boolean isDuplicatePair(List<int[]> result, int[] matchedResult) {

        int result1, result2;

        int matchedNumber1 = matchedResult[0];
        int matchedNumber2 = matchedResult[1];

        for (int[] eachRow : result) {

            for (int i = 0; i < eachRow.length; i++) {
                result1 = eachRow[0];
                result2 = eachRow[1];

                if (result1 == matchedNumber1 || result1 == matchedNumber2) {
                    return true;
                } else if (result2 == matchedNumber1 || result2 == matchedNumber2) {
                    return true;
                }
            }

        }
        return false;
    }
}
