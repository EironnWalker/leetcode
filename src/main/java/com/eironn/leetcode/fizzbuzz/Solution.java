package com.eironn.leetcode.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> resp = new ArrayList<>(n);
        String fizzBuzz = "FizzBuzz";
        String fizz = "Fizz";
        String buzz = "Buzz";
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                resp.add(fizzBuzz);
            } else if ((i + 1) % 3 == 0) {
                resp.add(fizz);
            } else if ((i + 1) % 5 == 0) {
                resp.add(buzz);
            } else {
                resp.add(String.valueOf(i + 1));
            }
        }
        return resp;
    }

}
