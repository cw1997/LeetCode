package me.chagnwei.leetcode.mergeTwoLists;

import me.chagnwei.leetcode.common.ListNode;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/8/22 14:04
 * @description
 */
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);

        System.out.println(new Solution().mergeTwoLists(l1, l2));
//        System.out.println(new Solution().mergeTwoLists(null, null));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode list = new ListNode();
        ListNode head = list;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                list.next = new ListNode(l1.val);
                list = list.next;

                l1 = l1.next;
            } else if (l1.val > l2.val) {
                list.next = new ListNode(l2.val);
                list = list.next;

                l2 = l2.next;
            } else {
                list.next = new ListNode(l1.val);
                list.next.next = new ListNode(l2.val);
                list = list.next.next;

                l1 = l1.next;
                l2 = l2.next;
            }
        }
        list.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
