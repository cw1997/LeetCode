package me.chagnwei.leetcode.common;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/12 3:18
 * @description
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * @author leetcode
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ListNode head = this;
        while (head != null) {
            sb.append(head.val).append(", ");
            head = head.next;
        }
        sb.append(']');
        return sb.toString();
    }
}
