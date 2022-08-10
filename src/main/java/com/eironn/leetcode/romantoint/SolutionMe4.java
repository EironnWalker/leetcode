package com.eironn.leetcode.romantoint;

import java.util.*;

@SuppressWarnings("DuplicatedCode")
public class SolutionMe4 {

    /**
     * 29 ms
     * 先替换特殊的4，9，40，90，再替换普通的。
     *
     * @param roman
     * @return
     */
    public int romanToInt(String roman) {
        int resp = 0;
        Map<String, Integer> map = new LinkedHashMap<String, Integer>() {
            {
                put("IV", 4);
                put("CM", 900);
                put("XL", 40);
                put("XC", 90);
                put("CD", 400);
                put("IX", 9);
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
            }
        };
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            while (roman.contains(key)) {
                resp += value;
                roman = roman.replaceFirst(key, "");
            }
        }
        return resp;
    }
}
