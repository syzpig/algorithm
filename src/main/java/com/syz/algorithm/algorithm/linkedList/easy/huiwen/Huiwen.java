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
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);
         ListNode listNode5 = new ListNode(1);

        listNode1.setNextNode(listNode2);
        listNode2.setNextNode(listNode3);
        listNode3.setNextNode(listNode4);
        // listNode4.setNextNode(listNode5);
        boolean flag= isPalindrome(listNode1);
        System.out.printf("==="+flag);
        //  exp(newListNode);
    }
    public static boolean  isPalindrome(ListNode head) {
        if(null == head){
            return false;
        }
        //1、找出中间点
        ListNode  fast=head,low=head;
        while (null != low && null != fast.nextNode && null != fast.nextNode.nextNode){
            fast= fast.nextNode.nextNode;
            low = low.nextNode;
        }
        if(fast !=null){
            low=low.nextNode;
        }

        //翻转后半段
        ListNode  newLow= tranf(low);
        //对比
        boolean flag=true;
        while (null != newLow ){
            if(newLow.data != head.data){
                flag=false;
            }
            newLow=newLow.nextNode;
            head=head.nextNode;
        }
        return flag;
    }

    //注意 采用地址引用会影响原始链表
    public static void medi(ListNode fast,ListNode low) {
        while (null != low && null != fast.nextNode && null != fast.nextNode.nextNode){
            fast= fast.nextNode.nextNode;
            low = low.nextNode;
        }

    }

    public static ListNode tranf(ListNode low) {
        ListNode pre=null;
        ListNode curr=low;
        while (null != curr){
            ListNode next=curr.nextNode;
            curr.nextNode=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}
