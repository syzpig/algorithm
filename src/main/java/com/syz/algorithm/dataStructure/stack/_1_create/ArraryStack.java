package com.syz.algorithm.dataStructure.stack._1_create;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: syz
 * @Description: 构造栈  1：使用数组构造
 * 采⽤顺序表实现的的栈，内部以数组为基础，实现对元素的存取操作。在应⽤中还要注意每次⼊栈之前先判断栈的
 * 容量是否够⽤，如果不够⽤，可以⽤Arrays.copyOf()进⾏扩容
 * @Date: 2022/12/16 16:04
 * @Version: 1.0
 */
public class ArraryStack<T> {

    //实现栈的数组
    private Object[]  stack;
    //栈顶元素
    private int top;

    //初始化
    ArraryStack(){
        stack=new Object[10];
    }

    //判断是否为空
    public Boolean isEmpty(){
        return top==0;
    }

    //返回栈顶元素
    public T peek() {
        T t = null;
        if (top > 0) {
            t = (T) stack[top - 1];
            return t;
        }
        return t;
    }

    //入栈
    public void push(T val){
        stack[top]=val;
        top++;
    }

    //出栈  返回栈顶元素
    public T pop(){
        //先获取栈顶数据
        T t=peek();
        if(t!=null){
            stack[top-1]=null;
            top--;
        }
       return t;
    }

    //扩容
    public void expandCapacity(int size){
        int len = stack.length;
        if (size > len) {
            size = size * 3 / 2 + 1;//每次扩⼤50%
            stack = Arrays.copyOf(stack, size);
        }

    }
}
