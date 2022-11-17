package com.syz.algorithm.algorithm.linkedList.easy.fanzhuan;

import com.syz.algorithm.algorithm.linkedList.model.ListNode;

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
    public static ListNode fanzhuan(ListNode listNode1) {
         ListNode pre=null;
         ListNode curr=listNode1;
         while (curr!=null){
             ListNode next=curr.nextNode;
             curr.nextNode=pre;
             pre = curr;
             curr=next;
         }
         return pre;
    }

    public static void exp(ListNode listNode1) {
        while (null != listNode1) {
            System.out.println("=============" + listNode1.data);
            listNode1 = listNode1.nextNode;
        }
    }
}
