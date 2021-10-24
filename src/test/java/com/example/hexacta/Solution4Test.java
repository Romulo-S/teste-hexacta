package com.example.hexacta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Solution4Test {

    private Solution4 solution4;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp() {
        solution4 = new Solution4();
    }

    @Test
    @DisplayName("Test example 4")
    void testSolution4() {

        int[] A = {-2, -1, 0, 2, 4, 7, 8, 9, 9};
        int[] B = {-3, 2, 1, 5, -1, 0, 8, 9, 9};
        solution4.printIntersection(A, B);
    }

}
