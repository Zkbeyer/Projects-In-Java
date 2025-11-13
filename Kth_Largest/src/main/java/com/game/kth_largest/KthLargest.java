package com.game.kth_largest;


import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> minHeap;

    public KthLargest() {
        minHeap = new PriorityQueue<>();
    }

    public Integer findKthLargest(int[] nums, int k) {
        minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}
