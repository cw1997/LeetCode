package me.chagnwei.leetcode.addDigits258;

import me.chagnwei.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.right = new TreeNode(4);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(6);
//        System.out.println(new Solution().binaryTreePaths(root));
        System.out.println(new Solution().addDigits(38));
    }

    public int addDigits(int num) {
        if (num <= 9) {
            return num;
        }
        List<Integer> list = new ArrayList<>();
        while (list.size() != 1) {
            list = f(num);
            num = 0;
            for (int n : list) {
                num += n;
            }
        }
        return num;
    }

    private static List<Integer> f(int num) {
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        return list;
    }

    private static int f(List<Integer> list) {
        int result = 0;
        int weight = 1;
        for (int n : list) {
            result += n * weight;
            weight *= 10;
        }
        return result;
    }
}
