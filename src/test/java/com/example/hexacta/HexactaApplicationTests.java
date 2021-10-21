package com.example.hexacta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HexactaApplicationTests {

    private Solutions solutions;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp() {
        solutions = new Solutions();
    }

    @Test
    @DisplayName("Test example 1")
    void testSolution1() {
        int[] A = {1, 3, 6, 4, 1, 2};
        assertEquals(5, solutions.solution(A));
    }

    @Test
    @DisplayName("Test example 2")
    void testSolution2() {
        int[] A = {1, 2, 3};
        assertEquals(4, solutions.solution(A));
    }

    @Test
    @DisplayName("Test example 3")
    void testSolution3() {
        int[] A = {-1, -3};
        assertEquals(1, solutions.solution(A));
    }
}
