package com.example.hexacta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Solution1Test {

    private Solution1 solution1;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp() {
        solution1 = new Solution1();
    }

    @Test
    @DisplayName("Test example 1")
    void testSolution1() {
        int[] A = {1, 3, 6, 4, 1, 2};
        assertEquals(5, solution1.solution1(A));
    }

    @Test
    @DisplayName("Test example 2")
    void testSolution2() {
        int[] A = {1, 2, 3};
        assertEquals(4, solution1.solution1(A));
    }

    @Test
    @DisplayName("Test example 3")
    void testSolution3() {
        int[] A = {-1, -3};
        assertEquals(1, solution1.solution1(A));
    }
}
