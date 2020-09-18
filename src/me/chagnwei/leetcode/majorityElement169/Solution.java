package me.chagnwei.leetcode.majorityElement169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(new Solution().majorityElement(new int[]{0,1,1,2,3,4,5}));
    }

    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num)+1);
//            } else {
//                map.put(num, 1);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry :
//                map.entrySet()) {
//            if (entry.getValue() > nums.length / 2) {
//                return entry.getKey();
//            }
//        }
//        return 0;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
