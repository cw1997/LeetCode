package me.chagnwei.leetcode.mySqrt69;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(-1));
        System.out.println(new Solution().mySqrt(0));
        System.out.println(new Solution().mySqrt(1));
        System.out.println(new Solution().mySqrt(2));
        System.out.println(new Solution().mySqrt(4));
        System.out.println(new Solution().mySqrt(8));
        System.out.println(new Solution().mySqrt(9));
        System.out.println(new Solution().mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        int ans = 0;
        int l = 0;
        int r = x;
        while (l <= r) {
            int m = (l + r) / 2;
            long pow = m * m;
            if (pow > x) {
                r = m - 1;
            } else if (pow <= x) {
                l = m + 1;
                ans = m;
            }
        }
        return ans;
    }
}
