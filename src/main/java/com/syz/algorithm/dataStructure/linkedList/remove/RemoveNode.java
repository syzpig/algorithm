package com.syz.algorithm.dataStructure.linkedList.remove;

import com.syz.algorithm.algorithm.model.Node;
import com.syz.algorithm.dataStructure.linkedList.query.QueryNode;

/**
 * @Author: syz
 * @Description: 链表删除工具方法
 * @Date: 2022/12/6 16:20
 * @Version: 1.0
 */
public class RemoveNode {
    /**
     * 删除节点
     * @param head 链表头节点
     * @param position 删除节点位置，取值从1开始
     * @return 删除后的链表头节点
     */
    public static Node deleteNode(Node head, int position) {
        if (head == null) {
            return null;
        }
        int size = QueryNode.getListLength(head);
        //思考⼀下，这⾥为什么是size，⽽不是size+1
        if (position > size || position < 1) {
            System.out.println("输⼊的参数有误");
            return head;
        }
        if (position == 1) {
            head = head.next;
            return head;
        }
        if(position == size){
            while (head.next.next==null){
                head.next=null;
            }
            return head;
        }
        //先找到要删除节点的前一个节点
        Node pNode=head;
        int count=1;
        while (count<position-1){
            pNode = pNode.next;
            count++;
        }
        Node currNode=pNode.next;
        pNode.next=currNode.next;


        return head;
    }

    private static int getListLength(Node head) {
        return 0;
    }
}
