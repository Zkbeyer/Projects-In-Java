package com.game.maintain_median;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        MedianClass medianClass = new MedianClass();

        for (int num : nums) {
            medianClass.addNum(num);
            medianClass.printTrees();
        }
    }

}
