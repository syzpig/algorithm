package com.syz.algorithm.algorithm.leetcode.linkedList.medium.test1;

public class Test1 {
    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        node11.next = node12;
        node12.next = node13;
        ListNode node21 = new ListNode(9);
        ListNode node22 = new ListNode(9);
        ListNode node23 = new ListNode(9);
        node21.next = node22;
        node22.next = node23;
        ListNode node = new ListNode();
        node.next = node11;

        ListNode head = null, tail = null;
        int carry = 0;
        while (node11 != null || node12 != null) {
            int n1 = node11 != null ? node11.val : 0;
            int n2 = node12 != null ? node12.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (node11 != null) {
                node11 = node11.next;
            }
            if (node12 != null) {
                node12 = node12.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }


    }
}
