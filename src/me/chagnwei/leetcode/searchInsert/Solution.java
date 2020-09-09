package me.chagnwei.leetcode.searchInsert;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && nums[i] < target) {
            ++i;
        }
//        for (int i = 0; i < nums.length; ++i) {
//            if (nums[i] >= target) {
//                return i;
//            }
//        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,6}, 5));
    }
}
