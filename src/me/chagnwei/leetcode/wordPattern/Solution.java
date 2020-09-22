package me.chagnwei.leetcode.wordPattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        char[] pa = pattern.toCharArray();
        String[] strs = s.split(" ");

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
//        char[] map = new char[26];

        if (pa.length != strs.length) {
            return false;
        }

        int len = pa.length;
        for (int i = 0; i < len; i++) {
            char key = pa[i];
            String value = strs[i];
            if (map.containsKey(key)) {
                if (!map.get(key).contentEquals(value) ) {
                    return false;
                }
            } else {
                if (set.contains(value)) {
                    return false;
                }
                set.add(value);
                map.put(key, value);
            }
        }

        return true;
    }
}
