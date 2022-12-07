package com.syz.algorithm.algorithm.model;

/**
 * @Author: syz
 * @Description: 链表实体
 * @Date: 2022/11/8 10:48
 * @Version: 1.0
 */
public class Node {
    /***
     * 下一个节点
     */
    public Node next;
    /***
     * 数据
     */
    public int val;
    public Node() {
    }
    public Node(int val) {
        this.val = val;
    }

    public Node(Node nextNode, int val) {
        this.next = next;
        this.val = val;
    }

    public Node getNextNode() {
        return next;
    }

    public void setNextNode(Node next) {
        this.next = next;
    }

    public int getData() {
        return val;
    }

    public void setData(int val) {
        this.val = val;
    }
}
