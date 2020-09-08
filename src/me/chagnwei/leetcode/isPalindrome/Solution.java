package me.chagnwei.leetcode.isPalindrome;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 13:57
 * @description
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        return s.contentEquals(reverse(s));
    }

    private String reverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
