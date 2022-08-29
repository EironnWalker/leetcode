package com.eironn.leetcode.sumarray;

public class Solution1 {

    public int[] runningSum(int[] nums) {
        int[] resp = new int[nums.length];
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            resp[i] = pre;
        }
        return resp;
    }
}
