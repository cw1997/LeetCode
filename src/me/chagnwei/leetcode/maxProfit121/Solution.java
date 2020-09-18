package me.chagnwei.leetcode.maxProfit121;

import java.util.Arrays;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length-1; i++) {
            max = Math.max(max, maxInArray(prices, i) - minInArray(prices, i+1));
        }
        return Math.max(max, 0);
    }

    static int minInArray(int[] arr, int split) {
        int min = arr[0];
        for (int i = 1; i < split; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    static int maxInArray(int[] arr, int split) {
        int max = arr[split];
        for (int i = split+1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
