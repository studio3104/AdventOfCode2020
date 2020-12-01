package com.studio3104.adventofcode2020.day1;

import com.studio3104.adventofcode2020.utilities.InputLoader;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    final int SUMTO = 2020;
    int[] input;

    public Problem1() {
        input = InputLoader.loadIntegerInput(1);
    }

    int[] getNumsOfTwoSum(int[] nums, int i, int sumTo) {
        Set<Integer> set = new HashSet<>();

        for (int j = i + 1; j < nums.length; ++j) {
            int n = nums[j];
            int toFind = sumTo - n;

            if (set.contains(toFind)) {
                return new int[]{n, toFind};
            }

            set.add(n);
        }

        return new int[]{0, 0};
    }

    public int getResult(int[] nums) {
        int[] twoSum = getNumsOfTwoSum(nums, -1, this.SUMTO);
        return twoSum[0] * twoSum[1];
    }

    public static void main(String[] args) {
        Problem1 problem = new Problem1();
        System.out.println(problem.getResult(problem.input));
    }
}
