package me.chagnwei.leetcode.isMatch;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        int si = 0;
        for (int pi = 0; pi < p.length()-1; pi++) {
            char pc = p.charAt(pi);
            char sc = s.charAt(si);
            if (p.charAt(pi+1) == '*' && pc == '.') {
                return true;
            } else if (p.charAt(pi+1) == '*') {
                si = pi;
//                pc = p.charAt(pi - 1);
                while (si < s.length() && pc == s.charAt(si++)) {
                }
                pi++;
            } else if (isaToz(pc)) {
                if (sc != pc) {
                    return false;
                }
                si++;
            } else if (pc == '.') {
                si++;
            } else {
                return false;
            }
        }
        return si == s.length();
    }

    private boolean isaToz(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        System.out.println(new Solution().isMatch(s, p));
    }
}
