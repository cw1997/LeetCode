package me.chagnwei.leetcode.multiply;

import java.util.Map;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().multiply("0", "9133"));
        System.out.println(new Solution().multiply("0000", "0000"));
        System.out.println(new Solution().multiply("0", "0"));
        System.out.println(new Solution().multiply("0", "1"));
        System.out.println(new Solution().multiply("1", "1"));
        System.out.println(new Solution().multiply("1", "23"));
        System.out.println(new Solution().multiply("2", "3"));
        System.out.println(new Solution().multiply("9", "9"));
        System.out.println(new Solution().multiply("408", "5"));
        System.out.println(new Solution().multiply("12", "23")); // 12*23=276
        System.out.println(new Solution().multiply("123", "456"));
    }

    /**
     * 123
     * 456
     * ---
     *
     */

    public String multiply(String num1, String num2) {
        char[] ca1 = num1.toCharArray();
        char[] ca2 = num2.toCharArray();
        int bitCount = ca1.length + ca2.length;
        int[] sum = new int[bitCount-1];
        StringBuilder sb = new StringBuilder(bitCount);
        for (int i = 0; i < ca1.length; i++) {
            int i1 = ca1[i] - '0';
            for (int j = 0; j < ca2.length; j++) {
                int i2 = ca2[j] - '0';
                sum[i+j] += i1 * i2;
            }
        }
        int carry = 0;
        for (int i = sum.length-1; i >= 0; --i) {
            int num = sum[i] + carry;
            carry = num / 10;
            int bit = num % 10;
            char c = (char) ('0' + bit);
            sb.append(c);
        }
        if (carry > 0) {
            char c = (char) ('0' + carry);
            sb.append(c);
        }
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}
