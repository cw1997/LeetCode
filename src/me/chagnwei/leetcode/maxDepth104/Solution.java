package me.chagnwei.leetcode.maxDepth104;

import me.chagnwei.leetcode.common.TreeNode;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        System.out.println(new Solution().maxDepth(treeNode));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return traverse(root, 0);
    }

    private static int traverse(TreeNode root, int n) {
        if (root == null) {
            return n;
        }
        return Math.max(traverse(root.left, n + 1), traverse(root.right, n + 1));
    }
}
