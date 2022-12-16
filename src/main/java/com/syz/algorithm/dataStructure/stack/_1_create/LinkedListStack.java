package com.syz.algorithm.dataStructure.stack._1_create;

import java.util.LinkedList;

/**
 * @Author: syz
 * @Description: 构造栈  1：使用java链表工具构造
 * @Date: 2022/12/16 16:04
 * @Version: 1.0
 */
public class LinkedListStack<T> {
    //构造栈
    private LinkedList<T> linkedList;

    //初始化
    LinkedListStack(){
        linkedList =new LinkedList<>();
    }

    //判断是否是空
    public Boolean isEmpty(){
        return linkedList.isEmpty();
    }

    //取出栈顶元素
    public T peek(){
        return linkedList.getFirst();
    }

    //入栈
    public void push(T t){
        if(t==null){
            return;
        }
        if(linkedList.size()==0){
            linkedList.add(t);
        }else {
            linkedList.addFirst(t);
        }
    }
    //出栈
    public T pop(){
        if(linkedList==null){
            return null;
        }else {
           return linkedList.removeFirst();
        }

    }
}
