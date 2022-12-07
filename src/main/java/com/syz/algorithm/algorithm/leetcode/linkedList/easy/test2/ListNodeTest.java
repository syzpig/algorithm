package com.syz.algorithm.algorithm.leetcode.linkedList.easy.test2;

import com.syz.algorithm.algorithm.model.ListNode;

/**
 * @Author: syz
 * @Description: 指针
 * @Date: 2022/11/8 11:02
 * @Version: 1.0
 */
public class ListNodeTest {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(6);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(6);

        listNode1.setNextNode(listNode2);
        listNode2.setNextNode(listNode3);
        listNode3.setNextNode(listNode4);
        listNode4.setNextNode(listNode5);

        ListNode listNode6 = new ListNode(6);

        listNode4.nextNode = listNode6;
        listNode6.nextNode = listNode5;

        //nextP(listNode1);

        //listNode5.nextNode=listNode1;
        //nextP(listNode1);
        ListNode listNode666 = remove(listNode1);
        System.out.println("===========" + listNode1);
        nextP1(listNode666);
    }

    public static void nextP(ListNode listNode) {
        if (listNode == null) {
            System.out.printf("链表不存在！");
            return;
        }
        ListNode temp=null;
        while (null != listNode) {
            System.out.println("===========" + listNode.data);
            System.out.println("===========" + listNode);
            if(listNode.nextNode!=null &&listNode.nextNode.data == 6){
                temp = listNode;
            }
            listNode=listNode.nextNode;
        }
        temp.nextNode=temp.nextNode.nextNode;

    }

    public static void nextP1(ListNode listNode) {
        if (listNode == null) {
            System.out.printf("链表不存在！");
            return;
        }
        while (null != listNode) {
            System.out.println("###########" + listNode.data);
            listNode=listNode.nextNode;
        }


    }
    //1 2 3 4 5 6
    //地址引用的方式
    public static void removeByAddress(ListNode listNode) {
        if (listNode == null) {
            System.out.printf("链表不存在！");
        }
        ListNode temp = null;
        while (null != listNode) {
            System.out.println("===========" + listNode);
            if (listNode.nextNode != null && listNode.nextNode.data == 6) {
                temp = listNode;
            }
            listNode = listNode.nextNode;
        }
        temp.nextNode = temp.nextNode.nextNode;
    }
    //与上面等价
    public static ListNode remove(ListNode listNode) {
        if (listNode == null) {
            System.out.printf("链表不存在！");
            return null;
        }


        ListNode head = new ListNode(0);
        head.nextNode = listNode;
        ListNode temp = head;
        while (null != temp.nextNode) {
            if (temp.nextNode.data == 6) {
                temp.nextNode = temp.nextNode.nextNode;
            }else {
                temp = temp.nextNode;
            }

        }
        return head.nextNode;
    }
}

//    public static void main(String[] args) {
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode temp = dummyHead;
//        while (temp.next != null) {
//            if (temp.next.val == val) {
//                temp.next = temp.next.next;
//            } else {
//                temp = temp.next;
//            }
//        }
//        return dummyHead.next;
//    }


