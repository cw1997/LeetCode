package me.chagnwei.leetcode.trap;

import java.util.Arrays;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(new Solution().trap(ints1));
    }

    public int trap(int[] height) {
        int sum = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
        }
        for (int i = height.length-2; i >= 0; --i) {
            maxRight[i] = Math.max(maxRight[i+1], height[i+1]);
        }
        for (int i = 1; i < height.length-1; i++) {
//            maxLeft[i] = Math.max(maxLeft[i], height[i-1]);
//            maxRight[i] = Math.max(maxRight[i], height[i+1]);
//            int left = 0;
//            for (int j = i-1; j >= 0; --j) {
//                left = Math.max(left, height[j]);
//            }
//            int right = 0;
//            for (int j = i; j < height.length; ++j) {
//                right = Math.max(right, height[j]);
//            }
            int min = Math.min(maxLeft[i], maxRight[i]);
            int diff = min - height[i];
            if (diff > 0) {
                sum += diff;
            }
        }
        return sum;
    }
}
