package com.syz.algorithm.algorithm.leetcode.linkedList.easy.tichuchongfushuju;

import com.syz.algorithm.algorithm.model.ListNode;

/**
 * @Author: syz
 * @Description: 删除重复数据
 * //给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 *
 * @Date: 2022/11/17 18:05
 * @Version: 1.0
 */
public class Chongfu {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.setNextNode(listNode2);
        listNode2.setNextNode(listNode3);
        listNode3.setNextNode(listNode4);
        listNode4.setNextNode(listNode5);
        ListNode newListNode = fanzhuan(listNode1);
        exp(newListNode);
    }

    //   1 -> 3 -> 3 -> 3 -> null
    public static ListNode fanzhuan(ListNode listNode1) {
        ListNode head = new ListNode(0);
        head.nextNode = listNode1;
        ListNode temp = head;
        while (null != temp.nextNode) {
            if (null != temp.nextNode.nextNode && temp.nextNode.data == temp.nextNode.nextNode.data) {
                temp.nextNode = temp.nextNode.nextNode;
            } else {
                temp = temp.nextNode;
            }
        }
        return head.nextNode;
    }

    public static void exp(ListNode listNode1) {
        while (null != listNode1) {
            System.out.println("=============" + listNode1.data);
            listNode1 = listNode1.nextNode;
        }
    }
}
