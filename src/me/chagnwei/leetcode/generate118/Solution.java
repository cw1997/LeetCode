package me.chagnwei.leetcode.generate118;

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
        System.out.println(new Solution().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j <= i-1; j++) {
                list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
