package com.syz.algorithm.dataStructure.array._3_doublePointerTopic._1_deleteRepeat;

import java.util.Arrays;

/**
 * @Author: syz
 * @Description: 删除重复元素
 * @Date: 2022/12/15 16:13
 * @Version: 1.0
 */
public class RemoveRepeat {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 3, 4, 4, 5, 6};
        System.out.println(remove(arr));
      //  System.out.println(rem(arr));

        System.out.println(Arrays.toString(arr));
    }

    //等值做法
    public static int  remove(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        //0、初始化指针
       int fast=1;
       int low=1;
       //1、fast指针遍历数组结束之后跳出循环
       while (fast<arr.length){
           //2、如果快指针前后校验值是否相等
           if(arr[fast-1]==arr[fast]){
               //3、快指针继续往后移动，
               fast++;
           } else {
               //4、快指针继续往后移动找到不同相邻的元素时，把不相同的元素移动到慢指针上
               arr[low]=arr[fast];
               //5、最后快慢指针继续往后移动，找到后续相同元素
               low++;
               fast++;
           }

       }
       return low;
    }
    //不等值做法
    public static int rem(int[] arr){
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        //0、初始化指针
        int fast=1;
        int slow=1;
        //1、fast指针遍历数组结束之后跳出循环
        while (fast<n){
            //2、如果快指针前后校验值是否相等
            if (arr[fast-1]!=arr[fast]){
                //3、不相等就把块指针的元素覆盖慢指针元素，慢指针对应的是相同元素的第一个元素。块指针对应的是后续不同的元素
               arr[slow] = arr[fast];
               //4、慢指针往后移动下一个元素，继续与快指针比较
               slow++;
            }
            //5、快指针每次都往后移动一个元素
            fast++;
        }
        return slow;
    }
}
