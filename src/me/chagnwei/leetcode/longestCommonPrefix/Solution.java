package me.chagnwei.leetcode.longestCommonPrefix;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/8 20:54
 * @description
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        }

        int sum = 0;

        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }

        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return strs[0].substring(0, sum);
                }
            }
            ++sum;
        }

        return strs[0].substring(0, sum);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
