package com.syz.algorithm.algorithm.linkedList.model;

/**
 * @Author: syz
 * @Description: 链表实体
 * @Date: 2022/11/8 10:48
 * @Version: 1.0
 */
public class ListNode {
    /***
     * 下一个节点
     */
    public ListNode nextNode;
    /***
     * 数据
     */
    public int data;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(ListNode nextNode, int data) {
        this.nextNode = nextNode;
        this.data = data;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
