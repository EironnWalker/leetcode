package com.eironn.leetcode.anagram;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if (map.containsKey(sorted)) {
                List<String> groupList = map.get(sorted);
                groupList.add(str);
            } else {
                List<String> groupList = new ArrayList<>();
                groupList.add(str);
                map.put(sorted, groupList);
            }
        }
        return new ArrayList<>(map.values());
    }

}
