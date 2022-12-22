package com.syz.algorithm.dataStructure.queue._1_create;


import java.util.Arrays;

/**
 * @Author: syz
 * @Description: 基于数组实现队列
 * @Date: 2022/12/19 10:15
 * @Version: 1.0
 */
public class ArraryQueue<T> {
    //定义数组 实现队列
    private Object[] queue;
    //定义队头指针
    private int font = 0;
    //定义队尾指针
    private int rear = 0;
    //队列大小
    private int size=0;
    //初始化队列
    private ArraryQueue(int size){
        this.size=size;
        queue=new Object[size];
        font=-1;
        rear=-1;
    }

    //判断队列是不是已满
    public Boolean isFull(){
        return rear==size-1;
    }
    //判断队列是不是空
    public Boolean isEmpty(){
        return font==rear;
    }


    //显示头部数据
    public Object peek(){
        if(isEmpty()){
            System.out.println("队列为空");
            return null;
        }
        return queue[font+1];
    }

    //入列
    public void add(T t){
        if(t==null){
            return;
        }
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        queue[rear]=t;
    }
    //出列
    public Object pop(){
        Object o=peek();
        queue[font]=0;
        return o;
    }

    //扩容
    public void kuorong(int size){
        if(size==0){
            return;
        }
        if(size> queue.length){
            queue= Arrays.copyOf(queue,size*3/2+1); //扩容50%
        }

    }
}
