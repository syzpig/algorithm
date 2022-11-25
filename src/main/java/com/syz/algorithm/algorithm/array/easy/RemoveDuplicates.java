package com.syz.algorithm.algorithm.array.easy;

import java.util.Arrays;

/**
 * @Author: syz
 * @Description: 数组去重
 * @Date: 2022/11/18 16:50
 * @Version: 1.0
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2};
        int i = 0;
        int j = 0;
        int[] newArr = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            if (i==arr.length-1 ) {
                newArr[j] = arr[i];
            } else {
                if (arr[i] == arr[i + 1]) {
                    continue;
                }
                newArr[j] = arr[i];
            }
            j++;
        }
        int num=i-j;
        int[] newArr1 = new int[j];
        if(num>=0){
           for (int n=0;n<j;n++){
               newArr1[n]=newArr[n];
           }
        }
        System.out.printf("==" + newArr1);
    }
}
