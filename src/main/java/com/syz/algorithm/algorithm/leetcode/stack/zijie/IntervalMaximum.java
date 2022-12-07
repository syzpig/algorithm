package com.syz.algorithm.algorithm.leetcode.stack.zijie;
/**
 *  @author: syz
 *  @Date: 2021/8/31 20:52
 *  @Description:  字节区间最大值  求区间中任意区间的最小值以及与区间的和的乘积    比如区间【5,2,3,4】 求这个区间内最小值与所在区间和乘积的最大
 *  【5】= 5*5=25
 *  【5,2】 = 2*（5+2）=17
 *  【5,2,3】 = 2*（5+2+3）=20
 *  【5,2,3,4】 = 2*（5+2+3+4）=28
 *  【2,3】 = 2*（2+3）=10
 *  。。。。。。
 *
 *
 *
 *  前缀和：区间最后以后对应的和前减去区间开始的前一位对应的和，等于区间和
 *  取最小数
 *
 */

public class IntervalMaximum {

//    public int getMac(int[] members){
//
//    }
}
