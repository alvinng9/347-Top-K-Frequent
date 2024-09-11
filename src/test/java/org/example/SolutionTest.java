package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void topKFrequentTest() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1,2}, solution.topKFrequent(new int[]{1,1,1,2,2,3},2));
        assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1},1));
        assertArrayEquals(new int[]{4,6,7}, solution.topKFrequent(
                new int[]{4,4,4,5,5,6,6,6,7,7,7},3));
    }

}