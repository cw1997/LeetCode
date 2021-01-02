package me.chagnwei.leetcode.pathSum113;

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
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(2);
        treeNode.right = new TreeNode(8);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.left = new TreeNode(5);
        treeNode.right.right.right = new TreeNode(1);
        System.out.println(new Solution().pathSum(treeNode, 22));
    }


    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> used = new ArrayList<>();
        dfs(root, sum, used);
        return ans;
    }

    public void dfs(TreeNode root, int sum, List<Integer> used) {
        if (root != null) {
            if (sum == root.val && root.left == null && root.right == null) {
                used.add(root.val);
                ans.add(new ArrayList<>(used));
                used.remove(used.size() - 1);
                return;
            }
            used.add(root.val);
            dfs(root.left, sum - root.val, used);
            dfs(root.right, sum - root.val, used);
            used.remove(used.size() - 1);
        }
    }
}
