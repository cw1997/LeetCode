package me.chagnwei.leetcode.singleNumber136;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11", "1"));
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num :
                nums) {
            result ^= num;
        }
        return result;
    }
}
