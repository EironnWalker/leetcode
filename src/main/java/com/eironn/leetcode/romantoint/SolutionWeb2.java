package com.eironn.leetcode.romantoint;

@SuppressWarnings("DuplicatedCode")
public class SolutionWeb2 {

    /**
     * 5ms，目前最快的方案
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int sum = getValue(s.charAt(s.length()-1));

        for(int i = s.length() - 2; i >= 0; --i) {
            int cVal = getValue(s.charAt(i));
            int pVal = getValue(s.charAt(i+1));
            sum += cVal >= pVal ? cVal : cVal*(-1);
        }

        return sum;
    }

    public int getValue(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X' :
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        return 0;
    }
}
