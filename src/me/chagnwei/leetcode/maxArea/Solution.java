package me.chagnwei.leetcode.maxArea;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 15:21
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, calcSurface(left, right, height));
            if (height[left] < height[right]) {
                ++left;
            } else {
                --right;
            }
        }
        return max;
    }

    static int calcSurface(int left, int right, int[] height) {
        return (right - left) * Math.min(height[left], height[right]);
    }
}
