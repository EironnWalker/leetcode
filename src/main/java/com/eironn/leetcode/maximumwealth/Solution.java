package com.eironn.leetcode.maximumwealth;

public class Solution {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sumAcc = 0;
            for (int i : account) {
                sumAcc += i;
            }
            max = Math.max(max, sumAcc);
        }
        return max;
    }
}
