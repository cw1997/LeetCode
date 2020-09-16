package me.chagnwei.leetcode.plusOne66;

import java.util.Arrays;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{1,9})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9,9})));
    }

    public int[] plusOne(int[] digits) {
        ++digits[digits.length-1];
        for (int i = digits.length-1; i > 0; --i) {
            if (digits[i] >= 10) {
                digits[i] -= 10;
                ++digits[i-1];
            }
        }
        if (digits[0] >= 10) {
            int[] ints = new int[digits.length + 1];
            ints[0] = digits[0] - 9;
            digits[0] -= 10;
            for (int i = 1; i <= digits.length; i++) {
                ints[i] = digits[i-1];
                return ints;
            }
        }
        return digits;
    }
}
