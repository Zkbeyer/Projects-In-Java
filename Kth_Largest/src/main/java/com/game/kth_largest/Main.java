package com.game.kth_largest;

public class Main {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7};

        KthLargest i = new KthLargest();

        Integer k = i.findKthLargest(data, 7);
        System.out.println(k);
    }
}
