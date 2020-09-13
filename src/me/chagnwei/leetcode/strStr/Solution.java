package me.chagnwei.leetcode.strStr;

import java.util.Arrays;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("hello", "ll"));
        System.out.println(new Solution().strStr("aaaaa", "bba"));
        System.out.println(new Solution().strStr("abc", ""));
        System.out.println(new Solution().strStr("abc", "b"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int end = haystack.length() - needle.length();
        for (int i = 0; i <= end; i++) {
            if (haystack.substring(i, i + needle.length()).contentEquals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
