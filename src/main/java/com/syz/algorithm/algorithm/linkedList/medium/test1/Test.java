package com.syz.algorithm.algorithm.linkedList.medium.test1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        node11.next = node12;
        node12.next = node13;
        ListNode node21 = new ListNode(7);
        ListNode node22 = new ListNode(8);
        //      ListNode node23 = new ListNode(9);
        node21.next = node22;
       //   node22.next = node23;
        ListNode node = new ListNode();
        node.next = node11;


        List<Integer> list11 = new ArrayList<>();
        while (node.next != null) {
            list11.add(node.next.val);
            node = node.next;
        }


        ListNode node2 = new ListNode();
        node2.next = node21;
        List<Integer> list22 = new ArrayList<>();
        while (node2.next != null) {
            list22.add(node2.next.val);
            node2 = node2.next;
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = list11.size()-1; i >=0; i--) {
            list1.add(list11.get(i));
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = list22.size()-1; i >=0; i--) {
            list2.add(list22.get(i));
        }

        int[] ll1 = null;
        if (list1.size() >= list2.size()) {
            ll1 = new int[list1.size()+1];
            for (int i = 0; i < list1.size(); i++) {
                if (i < list2.size()) {
                    if (ll1[i] > 0) {
                        ll1[i] = list1.get(i) + list2.get(i)+ ll1[i] ;
                    }else {
                        ll1[i] = list1.get(i) + list2.get(i);
                    }
                    if (ll1[i] >= 10) {
                        ll1[i] = ll1[i] - 10;
                        ll1[i + 1] = 1;
                    }
                } else {
                    if (ll1[i] > 0) {
                        ll1[i] = list1.get(i) + ll1[i];
                    } else {
                        ll1[i] = list1.get(i);
                    }
                    if (ll1[i] >= 10) {
                        ll1[i] = ll1[i] - 10;
                        ll1[i + 1] = 1;
                    }
                }
            }
            System.out.printf("=" + ll1);
        }

        if (list1.size() < list2.size()) {
            ll1 = new int[list2.size()+1];
            for (int i = 0; i < list2.size(); i++) {
                if (i < list1.size()) {
                    if (ll1[i] > 0) {
                        ll1[i] = list2.get(i) + list1.get(i)+ ll1[i] ;
                    }else {
                        ll1[i] = list2.get(i) + list1.get(i);
                    }
                    if (ll1[i] >= 10) {
                        ll1[i] = ll1[i] - 10;
                        ll1[i + 1] = 1;
                    }
                } else {
                    if (ll1[i] > 0) {
                        ll1[i] = list2.get(i) + ll1[i];
                    } else {
                        ll1[i] = list2.get(i);
                    }
                    if (ll1[i] >= 10) {
                        ll1[i] = ll1[i] - 10;
                        ll1[i + 1] = 1;
                    }
                }
            }
            System.out.printf("=" + ll1);
        }


        /*String s1 = "";
        for (int i = list1.size() - 1; i >= 0; i--) {
            s1 = s1 + list1.get(i);
        }
        System.out.printf("==" + s1);
        String s2 = "";
        for (int i = list2.size() - 1; i >= 0; i--) {
            s2 = s2 + list2.get(i);
        }
        System.out.printf("==" + s2);

        Integer i1 = Integer.parseInt(s1);
        Integer i2 = Integer.parseInt(s2);
        Integer sum = i1 + i2;
        System.out.printf("==" + sum);
        String[] str = sum.toString().split("");*/

        if (ll1[ll1.length-1]==0){
            for (int i = 0; i < ll1.length-1; i++) {
                ll1[i]=ll1[i];
            }
        }
        ListNode head = null;
        ListNode temp = null;
        ListNode node1 = null;
        int l = ll1.length - 1;
        for (int i = 0; i < ll1.length; i++) {
            node1 = new ListNode(ll1[i]);
            if (null == head) {
                head = node1;
                continue;
            }
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node1;
        }
        System.out.printf("" + head);
    }


    /**
     * 增加节点
     *
     * @param data
     */
    /*public void addNode(Object data) {
        ListNode node = new ListNode(data);
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

    }*/
}
