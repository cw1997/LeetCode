package me.chagnwei.leetcode.invertTree;

import me.chagnwei.leetcode.common.TreeNode;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new Solution().buildArray(new int[]{1, 3}, 3)));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left = this.invertTree(root.left);
        }
        if (root.right != null) {
            root.right = this.invertTree(root.right);
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }
}
