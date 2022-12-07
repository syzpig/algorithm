package com.syz.algorithm.dataStructure.linkedList.query;

import com.syz.algorithm.algorithm.model.Node;

/**
 * @Author: syz
 * @Description: 遍历链表
 * @Date: 2022/12/7 11:01
 * @Version: 1.0
 */
public class QueryNode {

    public static int getListLength(Node head) {
        int length = 0;
        Node node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
