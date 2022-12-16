package com.syz.algorithm.dataStructure.stack._2_javaStack;

import java.util.Stack;

/**
 * @Author: syz
 * @Description: java中栈的实现方式
 * @Date: 2022/12/16 15:59
 * @Version: 1.0
 */
public class JavaStack {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("栈顶元素为：" + stack.peek());
        while (!stack.empty()) {
            //只显示没出栈
            System.out.println(stack.peek());
            //出栈并且显示
            System.out.println(stack.pop());
        }
    }
}
