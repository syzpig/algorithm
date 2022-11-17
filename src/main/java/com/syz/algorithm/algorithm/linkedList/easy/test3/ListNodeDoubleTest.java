package com.syz.algorithm.algorithm.linkedList.easy.test3;

import com.syz.algorithm.algorithm.linkedList.model.ListNodeDouble;

/**
 * @Author: syz
 * @Description: 双向链表
 * @Date: 2022/11/10 9:20
 * @Version: 1.0
 */
public class ListNodeDoubleTest {
    public static void main(String[] args) {
        ListNodeDouble no1 = new ListNodeDouble(1);
        ListNodeDouble no2 = new ListNodeDouble(2);
        ListNodeDouble no3 = new ListNodeDouble(3);
        ListNodeDouble no4 = new ListNodeDouble(4);
        ListNodeDouble no5 = new ListNodeDouble(5);
        no1.nextNode = no2;
        no2.pre = no1;
        no2.nextNode = no3;
        no3.pre = no2;
        no3.nextNode = no4;
        no4.pre = no3;
        no4.nextNode = no5;
        no5.pre = no4;
       // insertPre(no4);
        insertNext(no4);
        dert(no1);
    }

    public static void dert(ListNodeDouble listNodeDouble) {
        while (null != listNodeDouble) {
            System.out.println("=====" + listNodeDouble.data);
            listNodeDouble = listNodeDouble.nextNode;
        }
        System.out.println("###############");
    }

    public static void insertPre(ListNodeDouble listNodeDouble) {
        ListNodeDouble no6 = new ListNodeDouble(6);
        ListNodeDouble pre = listNodeDouble.pre;
        pre.nextNode = no6;
        no6.pre = pre;
        no6.nextNode = listNodeDouble;
        listNodeDouble.pre = no6;
    }

    public static void insertNext(ListNodeDouble listNodeDouble) {
        ListNodeDouble no6 = new ListNodeDouble(6);
        ListNodeDouble next = listNodeDouble.nextNode;
        next.pre = no6;
        no6.nextNode = next;
        listNodeDouble.nextNode = no6;
        no6.pre= listNodeDouble;
    }

    public static void del(ListNodeDouble listNodeDouble) {
    }
}
