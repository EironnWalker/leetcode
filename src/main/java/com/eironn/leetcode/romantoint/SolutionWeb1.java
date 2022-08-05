package com.eironn.leetcode.romantoint;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("DuplicatedCode")
public class SolutionWeb1 {

    /**
     * 网友答案，11ms 最快6ms 和我第二个的差不多
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        char[] arr = s.toCharArray();

        int result = 0;
        int intVal, nextIntVal;

        for (int i = 0; i < arr.length; i++) {
            intVal = map.get(arr[i]);

            if (i != arr.length - 1) {
                nextIntVal = map.get(arr[i + 1]);

                if (nextIntVal > intVal) {
                    intVal = nextIntVal - intVal;
                    i = i + 1;
                }
            }
            result = result + intVal;
        }
        return result;
    }
}
