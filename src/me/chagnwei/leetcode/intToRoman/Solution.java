package me.chagnwei.leetcode.intToRoman;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/8 20:54
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(3));
        System.out.println(new Solution().intToRoman(4));
        System.out.println(new Solution().intToRoman(9));
        System.out.println(new Solution().intToRoman(58));
        System.out.println(new Solution().intToRoman(1994));
    }

    static int[] ints = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    static String[] strs = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = ints.length-1; i >= 0; --i) {
            while (num >= ints[i]) {
                num -= ints[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}
