package me.chagnwei.leetcode.convertToTitle168;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(1));
        System.out.println(new Solution().convertToTitle(26));
        System.out.println(new Solution().convertToTitle(27));
        System.out.println(new Solution().convertToTitle(28));
        System.out.println(new Solution().convertToTitle(701));
    }

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int weight = 1;
        while (n != 0) {
            --n;
            int bit = n % 26;
            sb.append((char)('A' + bit));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
