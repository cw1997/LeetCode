package me.chagnwei.leetcode.firstMissingPositive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints1 = {1,2,0};
        System.out.println(new Solution().firstMissingPositive(ints1));
        int[] ints2 = {3,4,-1,1};
        System.out.println(new Solution().firstMissingPositive(ints2));
        int[] ints3 = {7,8,9,11,12};
        System.out.println(new Solution().firstMissingPositive(ints3));
    }

    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            set.add(num);
            if (num > 0) {
                max = Math.max(max, num);
            }
        }
        int i = 1;
        while (i <= max) {
            if (!set.contains(i)) {
                return i;
            }
            ++i;
        }
        return i;
    }
}
