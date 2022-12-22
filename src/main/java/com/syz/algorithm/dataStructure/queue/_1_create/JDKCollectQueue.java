package com.syz.algorithm.dataStructure.queue._1_create;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: syz
 * @Description: 基于java jdk 集合实现队列
 * @Date: 2022/12/19 10:16
 * @Version: 1.0
 */
public class JDKCollectQueue<T> {

    //构造队列
    private ArrayList<T> arrayList;
    //下标
    private int index;


    //初始化
    JDKCollectQueue() {
        arrayList = new ArrayList<>();
        index = 0;
    }

    //判断是否是空
    public Boolean isEmpty() {
        return arrayList.isEmpty();
    }

    //取出栈顶元素
    public T peek() {
        return arrayList.get(index);
    }

    //入栈
    public void push(T t) {
        if (t == null) {
            return;
        }
        index++;
        arrayList.add(index, t);
    }

    //出栈
    public T pop() {
        if (arrayList == null) {
            return null;
        } else {
            index--;
            return arrayList.remove(0);
        }

    }
}
