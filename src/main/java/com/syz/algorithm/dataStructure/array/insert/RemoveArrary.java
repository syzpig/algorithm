package com.syz.algorithm.dataStructure.array.insert;

import java.util.Arrays;

/**
 * @Author: syz
 * @Description: 移除数组中元素
 * @Date: 2022/12/15 13:47
 * @Version: 1.0
 * 对于删除，不能⼀边从后向前移动⼀边查找了，因为元素可能不存在。所以要分为两个步骤，先查是否存在元素，
 * 存在再删除。
 * 这个⽅法和增加元素⼀样，必须⾃⼰亲⾃写才有作⽤，该⽅法同样要求删除序列最前、中间、最后和不存在的元素
 * 都能有效，下⾯给⼀个参考实现
 */
public class RemoveArrary {

    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        remove(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }

    public static void remove(int[] arr,  int val) {
//        if(size>=arr.length){
//            System.out.println("");
//            return;
//        }
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                index = i;
            }
        }
        if(index<0){
            System.out.println("该元素不存在！");
            return;
        }
        if(index==arr.length-1){
            arr[index]=0;
            return;
        }
        for (int i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        return;
    }

    /**
     * 从数组中删除元素key
     * @param arr 数组
     * @param size 数组中的元素个数，从1开始
     * @param val 删除的⽬标值
     */
    public static void remove(int[] arr, int size, int val) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index + 1; i < size; i++)
                arr[i - 1] = arr[i];
            size--;
        }
        return ;
    }
}
