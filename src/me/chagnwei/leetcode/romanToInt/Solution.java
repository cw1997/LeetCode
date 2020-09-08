package me.chagnwei.leetcode.romanToInt;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/8 20:54
 * @description
 */
public class Solution {
    private static enum RomanEnum {
        /**
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/roman-to-integer
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        I('I', 1),
        V('V', 5),
        X('X', 10),
        L('L', 50),
        C('C', 100),
        D('D', 500),
        M('M', 1000);

        private char c;
        private int v;

        RomanEnum(char c, int v) {
            this.c = c;
            this.v = v;
        }

        public char getC() {
            return c;
        }

        public int getV() {
            return v;
        }
    }
    public int romanToInt(String s) {
        int sum = 0;
        s += 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 'I' && charArray[i+1] == 'V') {
                sum += 4;
                ++i;
            } else if (c == 'I' && charArray[i+1] == 'X') {
                sum += 9;
                ++i;
            } else if (c == 'X' && charArray[i+1] == 'L') {
                sum += 40;
                ++i;
            } else if (c == 'X' && charArray[i+1] == 'C') {
                sum += 90;
                ++i;
            } else if (c == 'C' && charArray[i+1] == 'D') {
                sum += 400;
                ++i;
            } else if (c == 'C' && charArray[i+1] == 'M') {
                sum += 900;
                ++i;
            } else {
                switch (c) {
                    case 'I': {
                        sum += 1;
                        break;
                    }
                    case 'V': {
                        sum += 5;
                        break;
                    }
                    case 'X': {
                        sum += 10;
                        break;
                    }
                    case 'L': {
                        sum += 50;
                        break;
                    }
                    case 'C': {
                        sum += 100;
                        break;
                    }
                    case 'D': {
                        sum += 500;
                        break;
                    }
                    case 'M': {
                        sum += 1000;
                        break;
                    }
                    default: {

                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("III"));
        System.out.println(new Solution().romanToInt("IV"));
        System.out.println(new Solution().romanToInt("IX"));
        System.out.println(new Solution().romanToInt("LVIII"));
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}
