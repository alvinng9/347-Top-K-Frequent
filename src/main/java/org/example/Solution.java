package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap to put all nums and their frequencies in
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //create a priority queue to order the given nums based on their
        //frequencies
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        //add all the nums and their frequencies to the priority queue
        //to be put in the correct order
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] result = new int[k];
        int count = 0;
        //remove the first k amount of nums for the result
        while (!pq.isEmpty() && count < k) {
            result[count] = pq.remove()[0];
            count++;
        }
        return result;
    }
}
