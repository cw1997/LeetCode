package me.chagnwei.leetcode.titleToNumber171;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("A"));
        System.out.println(new Solution().titleToNumber("AB"));
        System.out.println(new Solution().titleToNumber("ZY"));
    }

    public int titleToNumber(String s) {
        char[] ca = s.toCharArray();
        int sum = 0;
        int weight = 1;
        for (int i = ca.length-1; i >= 0; --i) {
            sum += weight * (ca[i] - 'A' + 1);
            weight *= 26;
        }
        return sum;
    }
}
