package me.chagnwei.leetcode.myAtoi;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public int myAtoi(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        boolean negative = false;
        long num = 0;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            ++i;
        }

        if (i == str.length()) {
            return 0;
        }

        char nextChar = str.charAt(i);
        if (nextChar != '+' && nextChar != '-' && !Character.isDigit(nextChar)) {
            return 0;
        }
        if (nextChar == '+' || nextChar == '-') {
            ++i;
        }
//        if (isNum(nextChar) || nextChar == '+') {
//            negative = false;
//        }
        if (nextChar == '-') {
            negative = true;
        }

        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int bit = str.charAt(i) - '0';
            if (num > (Integer.MAX_VALUE - bit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num * 10 + bit;
            ++i;
        }

        return negative ? (int) -num : (int) num;
    }

    public static void main(String[] args) {
        System.out.printf("%d\n", new Solution().myAtoi("2147483646"));
        System.out.printf("%d\n", new Solution().myAtoi(" 1"));
        System.out.printf("%d\n", new Solution().myAtoi("    42"));
        System.out.printf("%d\n", new Solution().myAtoi("42"));
        System.out.printf("%d\n", new Solution().myAtoi("    -1"));
        System.out.printf("%d\n", new Solution().myAtoi("    45   "));
        System.out.printf("%d\n", new Solution().myAtoi("  fdas45fdsafsa"));
        System.out.printf("%d\n", new Solution().myAtoi("-91283472332"));
        System.out.printf("%d\n", new Solution().myAtoi("20000000000000000000"));
    }
}
