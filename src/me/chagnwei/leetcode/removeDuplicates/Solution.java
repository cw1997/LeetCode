package me.chagnwei.leetcode.removeDuplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/12 4:21
 * @description
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int cnt = 0;
        int i = 0;
        int num = nums[i];
        while (i < nums.length) {
            while (i < nums.length && nums[i] == num) {
                ++i;
            }
            if (i < nums.length) {
                num = nums[i];
                nums[++cnt] = num;
                ++i;
            }
        }
        return cnt+1;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 1, 2};
        System.out.println(new Solution().removeDuplicates(ints1));
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Solution().removeDuplicates(ints2));
        System.out.println(Arrays.toString(ints2));

        int[] ints3 = {1};
        System.out.println(new Solution().removeDuplicates(ints3));
        System.out.println(Arrays.toString(ints3));

        int[] ints4 = {1,1};
        System.out.println(new Solution().removeDuplicates(ints4));
        System.out.println(Arrays.toString(ints4));
    }
}
