package me.chagnwei.leetcode.rotate;

import java.util.Arrays;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.deepToString(matrix1));
        new Solution().rotate(matrix1);
        System.out.println(Arrays.deepToString(matrix1));

        int[][] matrix2 = {
            { 5, 1, 9,11},
            { 2, 4, 8,10},
            {13, 3, 6, 7},
            {15,14,12,16}
        };
        System.out.println(Arrays.deepToString(matrix2));
        new Solution().rotate(matrix2);
        System.out.println(Arrays.deepToString(matrix2));
    }

    public void rotate(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = x+1; y < matrix[x].length; y++) {
                int tmp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = tmp;
            }
            for (int y = 0; y < matrix[x].length / 2; y++) {
                int complementation = matrix.length - y - 1;
                int tmp = matrix[x][y];
                matrix[x][y] = matrix[x][complementation];
                matrix[x][complementation] = tmp;
            }
        }
    }
}
