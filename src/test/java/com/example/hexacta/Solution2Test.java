package com.example.hexacta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Solution2Test {

    private Solution2 solution2;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp() {
        solution2 = new Solution2();
    }

    @Test
    @DisplayName("Test example 2")
    void testSolution2() {
        int[] A = {-2, -1, 0, 2, 4, 7, 8, 9, 9};
        int x = 8;
        List<int[]> expectedArrayResult = new ArrayList<>() {
        };
        expectedArrayResult.add(new int[]{-1, 9});
        expectedArrayResult.add(new int[]{0, 8});
        expectedArrayResult.add(new int[]{4, 4});

        List<int[]> actual = solution2.solution2(A, x);

        printResultArray(actual);

        assertEquals(expectedArrayResult.size(), 3);


    }

    private void printResultArray(List<int[]> actual) {
        for (int[] eachRow : actual) {
            System.out.println(Arrays.toString(eachRow));
        }
    }


}
