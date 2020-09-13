package me.chagnwei.leetcode.removeElement;

import java.util.Arrays;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints1 = {1, 3};
        System.out.println(new Solution().removeElement(ints1, 3));
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = {3,2,2,3};
        System.out.println(new Solution().removeElement(ints2, 3));
        System.out.println(Arrays.toString(ints2));

        int[] ints3 = {0,1,2,2,3,0,4,2};
        System.out.println(new Solution().removeElement(ints3, 2));
        System.out.println(Arrays.toString(ints3));
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
            ++i;
        }
        return index;
    }
}
