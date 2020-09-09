package me.chagnwei.leetcode.isValid;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public boolean isValid(String s) {
        try {
            Deque<Character> deque = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    deque.push(c);
                } else {
                    Character pc = deque.pop();
                    if (pc == null) {
                        return false;
                    } else {
                        switch (c) {
                            case ')': {
                                if (pc != '(') {
                                    return false;
                                }
                                break;
                            }
                            case ']': {
                                if (pc != '[') {
                                    return false;
                                }
                                break;
                            }
                            case '}': {
                                if (pc != '{') {
                                    return false;
                                }
                                break;
                            }
                            default: {
                                return false;
                            }
                        }
                    }
                }
            }
            return deque.size() == 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()"));
        System.out.println(new Solution().isValid("()[]{}"));
        System.out.println(new Solution().isValid("()[()]{}"));
        System.out.println(new Solution().isValid("()[[)]]{}"));
        System.out.println(new Solution().isValid("([)]"));
        System.out.println(new Solution().isValid(""));
        System.out.println(new Solution().isValid("]"));
        System.out.println(new Solution().isValid("["));
    }
}
