package com.example.hexacta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Solution3Test {

    private Solution3 solution3;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp() {
        solution3 = new Solution3();
    }


    @Test
    @DisplayName("Test example 3")
    void testSolution3() {

        double v = solution3.calcPM(3, 2);

        assertEquals(8, v);
    }
}
