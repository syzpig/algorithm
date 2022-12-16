package com.syz.algorithm.dataStructure.stack._1_create;

import com.syz.algorithm.algorithm.model.Node;

/**
 * @Author: syz
 * @Description: 构造栈  1：使用链表构造
 * @Date: 2022/12/16 16:04
 * @Version: 1.0
 */
public class ListStack<T> {
    //定义链表
    class Node<T> {
        private T val;
        private Node next;
    }

    //实现栈的链表
    private Node<T> head;

    //构造函数初始化指针
    ListStack() {
        head = null;
    }

    //判断是否为空
    public Boolean isEmpty() {
        return head == null;
    }

    //返回栈顶元素
    public T peek() {
        T t = null;
        while (head != null) {
            t = head.val;
        }
        return t;
    }

    //入栈
    public void push(T t) {
        if (t == null) {
            System.out.println("入栈数据不存在");
            return;
        }
        if (head == null) {
            Node<T> tNode = new Node<>();
            tNode.val = t;
            head = tNode;
        } else {
            Node<T> tNode = new Node<>();
            tNode.val = t;
            tNode.next = head;
        }
    }

    //出栈
    public T pop() {
        if (head == null) {
            return null;
        }
        T t = head.val;
        head = head.next;
        return t;
    }


}
