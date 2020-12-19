package me.chagnwei.leetcode.spiralOrder54;

import java.util.ArrayList;
import java.util.List;

//[
//        [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ],
//        [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ],
//        [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ],
//        [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ],
//        [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ],
//        [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ],
//        [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ],
//]

class Solution {
    enum Direction {
        right,
        bottom,
        left,
        top,
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int top = 0;
        int bottom = rowSize;
        int left = 0;
        int right = colSize;
//        Pair<Integer, Integer> leftTop = new Pair<>(0, 0);
//        Pair<Integer, Integer> rightTop = new Pair<>(0, matrix[0].length);
//        Pair<Integer, Integer> rightBot = new Pair<>(matrix.length, matrix[0].length);
//        Pair<Integer, Integer> leftBottom = new Pair<>(matrix.length, 0);

        int size = rowSize * colSize;
        List<Integer> list = new ArrayList<>(size);

        int row = 0;
        int col = 0;
        Direction direction = Direction.right;

        while (list.size() != size) {
//            System.out.println(index);
            if (direction == Direction.right) {
                if (col < right){
                    list.add(matrix[row][col++]);
                } else {
                    top++;
                    row++;
                    col--;
                    direction = Direction.bottom;
                }
            } else if (direction == Direction.bottom) {
                if (row < bottom){
                    list.add(matrix[row++][col]);
                } else {
                    right--;
                    row--;
                    col--;
                    direction = Direction.left;
                }
            } else if (direction == Direction.left) {
                if (col >= left){
                    list.add(matrix[row][col--]);
                } else {
                    bottom--;
                    row--;
                    col++;
                    direction = Direction.top;
                }
            } else if (direction == Direction.top) {
                if (row >= top){
                    list.add(matrix[row--][col]);
                } else {
                    left++;
                    row++;
                    col++;
                    direction = Direction.right;
                }
            }
        }

        return list;

//        System.out.print("[");
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i]);
//            if (i != ans.length - 1) {
//                System.out.print(",");
//            }
//        }
//        System.out.print("]");
//        return;
    }

    public static void main(String[] args) {
        int[][] case1 = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(new Solution().spiralOrder(case1));
    }
}
