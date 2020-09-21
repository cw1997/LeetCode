package me.chagnwei.leetcode.reverseList206;

import me.chagnwei.leetcode.common.ListNode;

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
        System.out.println(new Solution().addBinary("11", "1"));
        System.out.println(new Solution().addBinary("1010", "1011"));
    }

    public ListNode reverseList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        ListNode node = new ListNode();
        ListNode ans = node;
        for (int i = list.size() - 1; i >= 0; --i) {
            node.next = new ListNode(list.get(i).val);
            node = node.next;
        }
        return ans.next;
    }
}
