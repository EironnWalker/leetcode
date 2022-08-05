package com.eironn.leetcode.romantoint;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("DuplicatedCode")
public class SolutionMe2 {

    /**
     * 10ms 左右，最快6ms
     * 去掉了第一次的变量声明，小list去掉了continue的写法
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
        int addValue;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length) {
                if (map.get(chars[i]) >= map.get(chars[i + 1])) {
                    addValue = map.get(chars[i]);
                } else {
                    addValue = map.get(chars[i + 1]) - map.get(chars[i]);
                    i++;
                }
            } else {
                addValue = map.get(chars[i]);
            }
            resp += addValue;
        }
        return resp;
    }
}
