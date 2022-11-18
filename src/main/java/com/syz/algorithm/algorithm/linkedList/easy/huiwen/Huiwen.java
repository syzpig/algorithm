package com.syz.algorithm.algorithm.linkedList.easy.huiwen;

import com.syz.algorithm.algorithm.linkedList.model.ListNode;

/**
 * @Author: syz
 * @Description: 回文链表
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 * @Date: 2022/11/18 9:23
 * @Version: 1.0
 */
public class Huiwen {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(1);

        listNode1.setNextNode(listNode2);
        listNode2.setNextNode(listNode3);
        listNode3.setNextNode(listNode4);
        listNode4.setNextNode(listNode5);
        ListNode newListNode = fanzhuan(listNode1);
        //  exp(newListNode);
    }

    //   1 -> 2 -> 2 -> 4 -> null
    public static ListNode fanzhuan(ListNode listNode1) {
        //获取中点
        ListNode fast = listNode1,slow=listNode1;
        while (slow!=null && fast.nextNode!=null && fast.nextNode.nextNode!=null){
            fast=fast.nextNode.nextNode;
            slow=slow.nextNode;
        }

        System.out.printf("flag="+slow);
        //翻转后部分
        ListNode slowNew = resave(slow);
        //两个指针对比
        boolean flag=true;
        while (null !=slowNew){
            if(slowNew.data !=listNode1.data){
                flag=false;
            }
            slowNew=slowNew.nextNode;
            listNode1=listNode1.nextNode;
        }
        System.out.println("===="+flag);
        return null;
    }

    public static void exp(ListNode listNode1) {
        while (null != listNode1) {
            System.out.println("=============" + listNode1.data);
            listNode1 = listNode1.nextNode;
        }
    }

    public static ListNode resave(ListNode slow) {
        ListNode head=new ListNode(0);
        head.nextNode=slow;
        ListNode pre=null;
        ListNode curr=head;
        while (null != curr) {
              ListNode next=curr.nextNode;
              curr.nextNode=pre;
              pre=curr;
              curr=next;
        }
        return pre;
    }
}
