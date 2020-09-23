package me.chagnwei.leetcode.searchMatrix74;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().addBinary("11", "1"));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rowNum = matrix.length;
        if (rowNum <= 0) {
            return false;
        }
        int colNum = matrix[0].length;
        if (colNum <= 0) {
            return false;
        }
        for (int y = 0; y < rowNum; y++) {
            if (target == matrix[y][0] || target == matrix[y][colNum-1]) {
                return true;
            } else if (target > matrix[y][0] && target < matrix[y][colNum-1]) {
                for (int x = 1; x < colNum-1; x++) {
                    if (target == matrix[y][x]) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
