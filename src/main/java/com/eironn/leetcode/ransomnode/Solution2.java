package com.eironn.leetcode.ransomnode;

/**
 * 网友的实现，借助于每个字母对应的ascii码位置记录出现次数，记录每个字母出现的位置和次数，返回对比结果。
 */
public class Solution2 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomArray = new int[26];
        int[] magArray = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomArray[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            magArray[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ransomArray[i] > magArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
        boolean b = solution1.canConstruct("abcde", "dcba");
        System.out.println(b);
    }
}
