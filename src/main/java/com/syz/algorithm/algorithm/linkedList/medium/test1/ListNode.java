package com.syz.algorithm.algorithm.linkedList.medium.test1;
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//        请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//        你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//         
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/add-two-numbers
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class ListNode {
   public int val;
   public ListNode next;

  public ListNode() {
    }

  public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
