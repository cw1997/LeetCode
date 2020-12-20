package me.chagnwei.leetcode.sumOfLeftLeaves404;

import me.chagnwei.leetcode.common.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;
    }

    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public void dfs(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                if (isLeaf(root.left)) sum += root.left.val;
                dfs(root.left);
            }
            if (root.right != null) {
                dfs(root.right);
            }
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(new Solution().sumOfLeftLeaves(root));
    }
}
