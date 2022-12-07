package com.syz.algorithm.algorithm.leetcode.array.medium;

/**
 * @Author: syz
 * @Description: 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * @Date: 2022/11/18 16:50
 * @Version: 1.0
 */
public class RemoveDuplicatesDoub {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1, 1, 2, 2,2,3,3,5};
        System.out.println("===" + count(arr));
    }

    public static int count(int[] arr) {
        int n=arr.length;
        if(n<=2){
            return arr.length;
        }
       int slow=2;
       int fast=2;
       while (fast<n){
           if(arr[fast] != arr[slow-2]){
               arr[slow]=arr[fast];
               ++slow;
           }
           ++fast;
       }
       return arr.length;
    }
}
