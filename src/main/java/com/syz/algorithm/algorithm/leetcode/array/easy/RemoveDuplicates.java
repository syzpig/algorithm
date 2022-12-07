package com.syz.algorithm.algorithm.leetcode.array.easy;

/**
 * @Author: syz
 * @Description: 数组去重
 * @Date: 2022/11/18 16:50
 * @Version: 1.0
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2,2,4};
//        int n=arr.length;
//         int fast=1;
//         int slow=1;
//         while (fast<n){
//             if(arr[fast] != arr[fast-1]){
//                 arr[slow] = arr[fast];
//                 ++ slow;
//             }
//             ++ fast;
//         }
        rem(arr);
        System.out.printf("==="+arr);
    }

    public static int rem(int[] nums){
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
