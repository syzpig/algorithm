package com.syz.algorithm.dataStructure.array._1_insert;

import java.util.Arrays;

/**
 * @Author: syz
 * @Description: 有序数组增加一个元素对应位置
 * @Date: 2022/12/14 17:36
 * @Version: 1.0
 *
 *
将给定的元素插⼊到递增数组的对应位置中，我们可以先找位置，再将其后元素整体右移，最后插⼊到空位置上。
这⾥需要注意，算法必须能保证在数组的⾸部、尾部和中间位置插⼊都可以成功。该问题貌似⼀个for循环就搞定
了，但是如果⾯试直接让你写并能正确运⾏，我相信很多⼈还是会折腾很久，甚⾄直接会挂。因为⾃⼰写的时候会
发现游标写size还是size-1，判断时要不要加等于等等，这⾥推荐⼀种实现⽅式。
 */
public class InsertArrary {

    public static void main(String[] args) {
        int[] arr=new int[]{1,4,6,9,0} ;
       // insert(arr,9,2);
        add(arr,4,10);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @Author syz
     * @Description
     * @Param arr 数组
     * @Param val 将要插入的值
     * @Param posit 插入的位置
     */
    public static void insert(int[] arr,int val,int posit){
        if(posit>=arr.length){
            System.out.println("插入数据位置溢出！");
            return;
        }
        if (posit == 0) {
            for (int i = arr.length-1; i >0; i--) {
                arr[i] = arr[i-1];
            }
            arr[posit] = val;
            return;
        }
        if (posit == arr.length-1) {
            arr[posit-1] = val;
            return;
        }
        if (0 < posit && posit < arr.length - 1) {
            for (int i = arr.length - 1; i > posit; i--) {
                arr[i] = arr[i - 1];
            }
            arr[posit] = val;
            return;
        }
    }

    /**
     * @Description  插入有序数组
     * @param arr
     * @param size 数组已经存储的元素数量，从1开始编号
     * @param val 待插⼊的元素
     * @return
     */
    public static void add(int[] arr, int size, int val) {
         //判断数组存储元素个数是否已满
        if(size>=arr.length){
            System.out.println("插入数据位置溢出！");
            return;
        }
        //获取需要插入的位置
        int index = size;
        for (int i = 0; i < size; i++) {
            if (arr[i] > val) {
                index = i;
                break;
            }
        }
        //插入对应位置
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = val;
        return;
    }

    /**
     * @param arr
     * @param size 数组已经存储的元素数量，从1开始编号
     * @param element 待插⼊的元素
     * @return
     */
    public static int addByElementSequence(int[] arr, int size, int element) {
        //问题①：是否应该是size>arr.length
        if (size >= arr.length)
            throw new IllegalArgumentException("Add failed. Array is full.");

        //问题②想想这⾥是否是index=0或者size-1？
        int index = size;
        //找到新元素的插⼊位置，问题③ 这⾥是否应该是size-1？
        for (int i = 0; i < size; i++) {
            if (element < arr[i]) {
                index = i;
                break;
            }
        }
        //元素后移，问题④想想这⾥为什么不是size-1
        for (int j = size; j > index; j--) {
            arr[j] = arr[j - 1]; //index下标开始的元素后移⼀个位置
        }
        arr[index] = element;//插⼊数据
        return index;
    }

}
