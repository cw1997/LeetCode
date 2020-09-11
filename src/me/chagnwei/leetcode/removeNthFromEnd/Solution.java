package me.chagnwei.leetcode.removeNthFromEnd;

import me.chagnwei.leetcode.common.ListNode;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head, current = head;
        for (int i = 0; i < n-1; ++i) {
            current = current.next;
        }
        if (current.next == null) {
            return head.next;
        } else {
            current = current.next;
            while (current.next != null) {
                current = current.next;
                prev = prev.next;
            }
            prev.next = prev.next.next;
            return head;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode node = head.next;
        node.next = new ListNode(3);
        node = node.next;
        node.next = new ListNode(4);
        node = node.next;
        node.next = new ListNode(5);
        node = node.next;

        System.out.println(head);
//        System.out.println(new Solution().removeNthFromEnd(head, 5));
        System.out.println(new Solution().removeNthFromEnd(head, 2));
//        System.out.println(new Solution().removeNthFromEnd(head, 1));
    }
}
