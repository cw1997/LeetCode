package me.chagnwei.leetcode.climbStairs70;

import me.chagnwei.leetcode.common.TreeNode;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(2));
        System.out.println(new Solution().climbStairs(3));
        System.out.println(new Solution().climbStairs(4));
        System.out.println(new Solution().climbStairs(45));
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
