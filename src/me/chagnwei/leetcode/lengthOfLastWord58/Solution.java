package me.chagnwei.leetcode.lengthOfLastWord58;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
        System.out.println(new Solution().lengthOfLastWord("a"));
        System.out.println(new Solution().lengthOfLastWord("a "));
        System.out.println(new Solution().lengthOfLastWord("World"));
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        char[] ca = s.toCharArray();
        int result = 0;
        int i = ca.length-1;
        while (i >= 0) {
            if (ca[i] != ' ') {
                ++result;
            }
            --i;
            if (i < 0 || ca[i+1] == ' ') {
                break;
            }
        }
        return result;
    }
}
