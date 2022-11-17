package com.syz.algorithm.algorithm.linkedList.easy.test2;

import com.syz.algorithm.algorithm.linkedList.model.ListNode;

/**
 * @Author: syz
 * @Description: 指针
 * @Date: 2022/11/8 11:02
 * @Version: 1.0
 */
public class ListNodeTest {

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

        ListNode listNode6 = new ListNode(6);

        listNode4.nextNode = listNode6;
        listNode6.nextNode = listNode5;

        //nextP(listNode1);

        //listNode5.nextNode=listNode1;
        //nextP(listNode1);
        remove(listNode6);
        System.out.println("===========" + listNode1);
        nextP1(listNode1);
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

    public static void remove(ListNode listNode) {
        if (listNode == null) {
            System.out.printf("链表不存在！");
            return;
        }
        ListNode node=  listNode.nextNode;


    }
}
