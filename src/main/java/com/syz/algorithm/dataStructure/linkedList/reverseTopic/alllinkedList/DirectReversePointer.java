package com.syz.algorithm.dataStructure.linkedList.reverseTopic.alllinkedList;

import com.syz.algorithm.algorithm.model.ListNode;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;

/**
 * @Author: syz
 * @Description: 直接反转指针法
 * @Date: 2022/12/7 11:27
 * @Version: 1.0
 */
public class DirectReversePointer {
    public static void main(String[] args) throws InterruptedException {
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

    // 1 -> 2 -> 3 -> 4
    // 1 <- 2 <- 3 <- 4
    public static ListNode fanzhuan(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while (cur !=null){
            ListNode next=cur.nextNode;
            cur.nextNode=pre;
            pre=cur;
            cur=next;
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
