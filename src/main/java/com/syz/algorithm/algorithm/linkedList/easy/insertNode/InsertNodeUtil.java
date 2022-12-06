package com.syz.algorithm.algorithm.linkedList.easy.insertNode;

import com.syz.algorithm.algorithm.linkedList.model.ListNode;
import com.syz.algorithm.algorithm.linkedList.model.Node;

import static java.lang.reflect.Array.getLength;

/**
 * @Author: syz
 * @Description: 插入链表公共方法
 * @Date: 2022/12/6 14:39
 * @Version: 1.0
 */
public class InsertNodeUtil {

    /**
     * 链表插⼊
     * @param head 链表头节点
     * @param nodeInsert 待插⼊节点
     * @param position 待插⼊位置，从1开始
     * @return 插⼊后得到的链表头节点
     */
    public static Node insertNode(Node head, Node nodeInsert, int position) {
        if (head == null) {
            //这⾥可以认为待插⼊的结点就是链表的头结点，也可以抛出不能插⼊的异常
            return nodeInsert;
        }
        //已经存放的元素个数
        int size = getLength(head);
        if (position > size+1 || position < 1) {
            System.out.println("位置参数越界");
            return head;
        }
        if(position==1){
            //插入的是头结点
            nodeInsert.next=head;
            // return nodeInsert; 或者
            head=nodeInsert;
            return head;
        }
        if(position==size){
            //尾部插入
            while (head.next==null){
                head.next=nodeInsert;
            }
            return head;
        }
        //找到插入位置的当前节点
        int count=1;
        Node pNode =head;
        while (count<position-1){
            pNode=pNode.next;
            count++;
        }
        nodeInsert.next=pNode.next;
        pNode.next=nodeInsert;
        return head;

    }
}
