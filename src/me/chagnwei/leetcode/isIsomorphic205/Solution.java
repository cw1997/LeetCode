package me.chagnwei.leetcode.isIsomorphic205;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("egg", "add"));
        System.out.println(new Solution().isIsomorphic("foo", "bar"));
        System.out.println(new Solution().isIsomorphic("paper", "title"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        for (int i = 0; i < sa.length; i++) {
            int diff1 = sa[i] - ta[i];
            if (map1.containsKey(sa[i])) {
                if (map1.get(sa[i]) != diff1) {
                    return false;
                }
            } else {
                map1.put(sa[i], diff1);
            }

            int diff2 = ta[i] - sa[i];
            if (map2.containsKey(ta[i])) {
                if (map2.get(ta[i]) != diff2) {
                    return false;
                }
            } else {
                map2.put(ta[i], diff2);
            }
        }
        return true;
    }
}
