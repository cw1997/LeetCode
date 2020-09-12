package me.chagnwei.leetcode.isValidSudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.printf("%b\n", new Solution().isValidSudoku(new char[][]{
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        }));
        System.out.printf("%b\n", new Solution().isValidSudoku(new char[][]{
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        }));
    }

    public boolean isValidSudoku(char[][] board) {
//        row
        for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {
            char[] ca = board[rowIndex];
            Set<Character> cSet = new HashSet<>();
            int numCnt = calcNumCount(ca);
            for (char c : ca) {
                cSet.add(c);
            }
            if (numCnt != cSet.size() - 1) {
                return false;
            }
        }
//        col
        for (int colIndex = 0; colIndex < 9; colIndex++) {
            char[] ca = new char[9];
            for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
                ca[rowIndex] = board[rowIndex][colIndex];
            }
            Set<Character> cSet = new HashSet<>();
            int numCnt = calcNumCount(ca);
            for (char c : ca) {
                cSet.add(c);
            }
            if (numCnt != cSet.size() - 1) {
                return false;
            }
        }
//        col
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int colIndex = 0; colIndex < 3; colIndex++) {
                char[] ca = new char[9];
                int index = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        char c = board[rowIndex * 3 + x][colIndex * 3 + y];
                        ca[index++] = c;
                    }
                }
                Set<Character> cSet = new HashSet<>();
                int numCnt = calcNumCount(ca);
                for (char c : ca) {
                    cSet.add(c);
                }
                if (numCnt != cSet.size() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    static int calcNumCount(char[] ca) {
        int sum = 0;
        for (int i = 0; i < ca.length; i++) {
            if (Character.isDigit(ca[i])) {
                ++sum;
            }
        }
        return sum;
    }
}
