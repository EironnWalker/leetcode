package com.eironn.leetcode.ransomnode;

/**
 * 网友的实现
 */
public class Solution2 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countMagazine = new int[26];
        int[] countRansomNote = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            countMagazine[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            countRansomNote[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (countRansomNote[i] > countMagazine[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        Solution2 solution1 = new Solution2();
//        boolean b = solution1.canConstruct("121212", "11212");
//        System.out.println(b);
        int[] countMagazine = new int[26];
        int i1 = 'm' - 'a';
        countMagazine[i1]++;
        System.out.println(i1);

    }
}
