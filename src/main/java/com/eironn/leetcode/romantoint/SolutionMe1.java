package com.eironn.leetcode.romantoint;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("DuplicatedCode")
public class SolutionMe1 {

    /**
     * 19ms
     * 声明了一些可不声明的变量 current nextChar。
     * 小list使用了continue损耗性能。
     *
     * @param roman
     * @return
     */
    public int romanToInt(String roman) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        char[] chars = roman.toCharArray();
        int resp = 0;
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            char nextChar;
            if (i + 1 < chars.length) {
                nextChar = chars[i + 1];
            } else {
                resp += map.get(current);
                continue;
            }
            if (map.get(current) >= map.get(nextChar)) {
                resp += map.get(current);
            } else {
                resp += map.get(nextChar) - map.get(current);
                i++;
            }
        }
        return resp;
    }
}
