package me.chagnwei.leetcode.reverseString344;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().addBinary("11", "1"));
    }

    public void reverseString(char[] s) {
        int len = s.length - 1;
        int lenDiv2 = s.length / 2;
        for (int i = 0; i < lenDiv2; i++) {
            char tmp = s[i];
            s[i] = s[len - i];
            s[len - i] = tmp;
        }
    }
}
