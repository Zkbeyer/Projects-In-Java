package com.game.maintain_median;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianClass {
    private final PriorityQueue<Integer> minHeap;
    private final PriorityQueue<Integer> maxHeap;
    private double median;

    public MedianClass() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        median = 0;
    }

    public void addNum(int num) {
        if (num <= median) {
            maxHeap.add(num);
        }
        else {
            minHeap.add(num);
        }
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.remove());
        }
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.remove());
        }

        calcMedian();
    }

    public double getMedian() {
        return median;
    }

    private void calcMedian(){
        if (maxHeap.isEmpty()) {
            median = 0;
            return;
        }
        else if (maxHeap.size() == minHeap.size()) {
            median = (maxHeap.peek() + minHeap.peek()) / 2.0;
            return;
        }
        else {
            median = maxHeap.peek();
            return;
        }
    }

    public void printTrees() {
        System.out.println("Median: " + median);
        System.out.println("Min: " + minHeap);
        System.out.println("Max: " + maxHeap);
        System.out.println(" ");
        //minHeap.forEach(System.out::println);
        //maxHeap.forEach(System.out::println);

    }

}
