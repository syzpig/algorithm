package com.syz.algorithm.dataStructure.queue._1_create;

/**
 * @Author: syz
 * @Description: 基于链表实现队列
 * @Date: 2022/12/19 10:16
 * @Version: 1.0
 */
public class ListQueue<T> {

    public class Node<T>{
        private T val;
        private Node next;
    }

    //定义链表队列
    private Node<T> queue;
    //队列头
    private int first;
    //队列尾
    private int last;
    //队列元素大小
    private int size=0;

    //判断是否为空
    public Boolean isEmpty(){
      return   queue==null;
    }
    //取出队列尾元素
    public T peek(){
        if(queue!=null){
           return queue.val;
        }
        return null;
    }

    //入栈
    public void push(T val){
        if(val==null){
            return;
        }
        Node node=new Node();
        node.val=val;
        if(queue.next!=null){
            queue=queue.next;
        }
        queue.next=node;
    }

    //出栈
    public T pop(){
        T t=peek();
        if(queue!=null){
            queue=queue.next;
        }

        return t;
    }
}
