package me.chagnwei.leetcode.letterCombinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    private static String[] strs;
    private static List<String> list;
    private static String[] sub;
    static {
        strs = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz",};
    }

    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();
        if (digits.length() == 0) {
            return list;
        }

        sub = new String[digits.length()];
        char[] ca = digits.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            String str = strs[ca[i] - '2'];
            for (int j = 0; j < str.length(); j++) {
                sub[i] = str;
            }
        }

        System.out.println(Arrays.toString(sub));
        f(0, new StringBuilder());

        return list;
    }

    private static void f(int index, StringBuilder sb) {
        if (index >= sub.length) {
            list.add(sb.toString());
        } else {
            String s = sub[index];
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                f(index+1, sb);
                sb.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("23"));
        System.out.println(new Solution().letterCombinations(""));
//        System.out.println(new Solution().letterCombinations("2"));
//        System.out.println(new Solution().letterCombinations("3"));
//        System.out.println(new Solution().letterCombinations("4"));
//        System.out.println(new Solution().letterCombinations("34"));
//        System.out.println(new Solution().letterCombinations("234"));
    }
}
