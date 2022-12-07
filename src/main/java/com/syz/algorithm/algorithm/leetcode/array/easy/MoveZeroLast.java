package com.syz.algorithm.algorithm.leetcode.array.easy;

/**
 * @Author: syz
 * @Description: 移动数组中0至末尾
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * https://mp.weixin.qq.com/s/bH3UjNDyJNKM0Enn5cQgQg
 *
 * @Date: 2022/11/23 11:19
 * @Version: 1.0
 */
public class MoveZeroLast {

    public static void main(String[] args) {
        int[] num = new int[]{1, 0, 0, 0, 4, 5};
        int slow = 0;
        for (int m = 0; m < num.length; m++) {
           if(num[m] !=0){
               num[slow] = num[m];
               slow++;
           }
        }
        for (int i=slow;i<num.length;i++){
            num[i]=0;
        }
        System.out.printf("===" + num);
    }
}
