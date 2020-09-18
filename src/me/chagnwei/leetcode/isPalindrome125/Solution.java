package me.chagnwei.leetcode.isPalindrome125;

import me.chagnwei.leetcode.common.TreeNode;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution().isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {
        char[] ca = s.toCharArray();
        int left = 0;
        int right = ca.length-1;
        while (left < right) {
            if (!Character.isLetterOrDigit(ca[left])) {
                ++left;
                continue;
            }
            if (!Character.isLetterOrDigit(ca[right])) {
                --right;
                continue;
            }
            if (Character.toLowerCase(ca[left++]) != Character.toLowerCase(ca[right--])) {
                return false;
            }
        }
        return true;
    }
}
