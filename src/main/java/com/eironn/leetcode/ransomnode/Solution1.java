package com.eironn.leetcode.ransomnode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 用list比较慢我自己实现的，用char更快一点
 */
public class Solution1 {

    public boolean canConstruct(String ransomNote, String magazine) {
        String[] ransomList = ransomNote.split("");
        List<String> magList = new ArrayList<>(magazine.length());
        magList.addAll(Arrays.asList(magazine.split("")));
        for (String ransomStr : ransomList) {
            int magIndex = magList.indexOf(ransomStr);
            if (magIndex < 0) {
                return false;
            }
            magList.remove(magIndex);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        boolean b = solution1.canConstruct("121212", "11212");
        System.out.println(b);
    }
}
