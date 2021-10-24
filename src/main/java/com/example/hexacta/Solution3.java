package com.example.hexacta;

import java.security.InvalidParameterException;

public class Solution3 {

    /**
     * Calculates the power of the given number
     *
     * @param m The exponent
     * @param p The base number
     * @return The result of p to power m
     */
    public double calcPM(int m, double p) {

        isValidPower(m);

        double result = p;

        for (int i = 1; i < m; i++) {
            result *= p;
        }
        return result;
    }

    private boolean isValidPower(int m) {
        if (1 <= m && m <= Math.pow(10, 9)) {
            return true;
        }
        throw new InvalidParameterException();
    }
}
