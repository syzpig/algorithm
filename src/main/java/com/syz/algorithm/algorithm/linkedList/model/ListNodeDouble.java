package com.syz.algorithm.algorithm.linkedList.model;

/**
 * @Author: syz
 * @Description: 链表实体
 * @Date: 2022/11/8 10:48
 * @Version: 1.0
 */
public class ListNodeDouble {

    /***
     * 前一个节点
     */
    public ListNodeDouble pre;
    /***
     * 下一个节点
     */
    public ListNodeDouble nextNode;
    /***
     * 数据
     */
    public int data;

    public ListNodeDouble(int data) {
        this.data = data;
    }

    public ListNodeDouble(ListNodeDouble nextNode, int data) {
        this.nextNode = nextNode;
        this.data = data;
    }

    public ListNodeDouble(ListNodeDouble pre, ListNodeDouble nextNode, int data) {
        this.pre = pre;
        this.nextNode = nextNode;
        this.data = data;
    }

    public ListNodeDouble getPre() {
        return pre;
    }

    public void setPre(ListNodeDouble pre) {
        this.pre = pre;
    }

    public ListNodeDouble getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNodeDouble nextNode) {
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
