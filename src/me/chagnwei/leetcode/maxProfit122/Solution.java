package me.chagnwei.leetcode.maxProfit122;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(new Solution().maxProfit(new int[]{1,2,3,4,5}));
    }

    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1] > prices[i]) {
                ans += (prices[i+1] - prices[i]);
            }
        }
        return ans;
    }
}
