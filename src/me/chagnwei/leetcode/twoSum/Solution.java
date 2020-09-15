package me.chagnwei.leetcode.twoSum;

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
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
