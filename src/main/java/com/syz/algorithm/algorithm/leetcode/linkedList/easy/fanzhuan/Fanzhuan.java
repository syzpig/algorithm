package com.syz.algorithm.algorithm.leetcode.linkedList.easy.fanzhuan;

import com.syz.algorithm.algorithm.model.ListNode;

/**
 * @Author: syz
 * @Description: 翻转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @Date: 2022/11/10 17:00
 * @Version: 1.0
 */
public class Fanzhuan {

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

    //   1 -> 2 -> 3 -> 4 -> null
    //null <- 1 <- 2 <- 3 <- 4

    public static ListNode fanzhuan(ListNode head) {
        ListNode senNode = new ListNode(-1);
        ListNode curr=head;
        while (curr!=null){
            //先拿到待处理链表，否则无法往后遍历
            ListNode next=curr.nextNode;
            //然后必须先把头结点下个节点拼接在当前节点下一个节点，
            curr.nextNode= senNode.nextNode;
            //再然后把当前节点拼接给头结点
            senNode.nextNode=curr;
            //最后就是 移动当前节点往下遍历
            curr=next;
        }
        return senNode=senNode.nextNode;
    }

    public static void exp(ListNode listNode1) {
        while (null != listNode1) {
            System.out.println("=============" + listNode1.data);
            listNode1 = listNode1.nextNode;
        }
    }
}
