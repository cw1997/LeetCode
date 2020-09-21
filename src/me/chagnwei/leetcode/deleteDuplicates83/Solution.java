package me.chagnwei.leetcode.deleteDuplicates83;

import me.chagnwei.leetcode.common.ListNode;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().hasCycle("11", "1"));
//        System.out.println(new Solution().hasCycle("1010", "1011"));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            while (next != null && node.val == next.val) {
                next = next.next;
            }
            node.next = next;
            node = node.next;
        }
        return head;
    }
}
