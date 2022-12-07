package com.syz.algorithm.algorithm.leetcode.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: syz
 * @Description: 测试值传递
 * @Date: 2022/11/9 10:10
 * @Version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> in1=new ArrayList<>();
        in1.add(1);
        List<?> in2;
        in2=in1;
        boolean flag = true;
        //in2.add(flag);
        System.out.printf("==="+in2.get(0));
        Integer b=1;
        HashMap<Integer,Integer> map =new HashMap();
        map.put(b,b);
        Long a=1L;
        map.get(b);
    }
}
