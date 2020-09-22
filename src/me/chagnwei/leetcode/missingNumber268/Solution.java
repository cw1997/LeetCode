package me.chagnwei.leetcode.missingNumber268;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{3,0,1}));
    }

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
        for (int num: nums) {
            set.add(num);
//            min = Math.min(min, num);
//            max = Math.max(max, num);
        }
        int len = nums.length;
        for (int i = 0; i <= len; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
