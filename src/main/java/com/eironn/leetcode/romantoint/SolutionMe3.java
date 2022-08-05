package com.eironn.leetcode.romantoint;

@SuppressWarnings("DuplicatedCode")
public class SolutionMe3 {

    /**
     * 最快有5ms吧
     * 在2的基础上，map 改为switch
     *
     * @param roman
     * @return
     */
    public int romanToInt(String roman) {
        char[] chars = roman.toCharArray();
        int resp = 0;
        int addValue;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length) {
                if (getValue(chars[i]) >= getValue(chars[i + 1])) {
                    addValue = getValue(chars[i]);
                } else {
                    addValue = getValue(chars[i + 1]) - getValue(chars[i]);
                    i++;
                }
            } else {
                addValue = getValue(chars[i]);
            }
            resp += addValue;
        }
        return resp;
    }

    private int getValue(Character c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
