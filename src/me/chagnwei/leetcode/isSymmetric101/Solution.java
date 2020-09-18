package me.chagnwei.leetcode.isSymmetric101;

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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSameTree(root.left, root.right);
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        } else {
            return p == null && q == null;
        }
    }
}
