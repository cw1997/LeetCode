package me.chagnwei.leetcode.countAndSay;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(new Solution().countAndSay(i));
        }
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            String str = countAndSay(n-1);
            char[] ca = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            int index = 0;
            while (index < ca.length) {
                int cnt = 1;
                char bit = ca[index];
                while (++index < ca.length && ca[index] == bit) {
                    ++cnt;
                }
                sb.append(cnt);
                sb.append(ca[index-1]);
            }
            return sb.toString();
        }

    }
}
