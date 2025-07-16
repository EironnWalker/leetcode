package com.eironn.leetcode.sumofarray;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checkMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int div = target - nums[i];
            if (checkMap.containsKey(div)) {
                return new int[]{i, checkMap.get(div)};
            }
            checkMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        Solution1 solution = new Solution1();
        solution.twoSum(nums, 9);
    }
}
