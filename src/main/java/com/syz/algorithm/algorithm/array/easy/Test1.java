package com.syz.algorithm.algorithm.array.easy;

import com.syz.algorithm.algorithm.linkedList.model.ListNodeBasicUse;

import java.util.Arrays;

//重新排列数组
public class Test1 {
    public static void main(String[] args) {
        //题目
  /*       给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/shuffle-the-array
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

//
//        int[] nums1 = new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
//        int n = 5;
//        int[] num =new int[nums1.length];
//        int j=0;
//        for (int i=0;i<n;i++){
//            num[j+i]=nums1[i];
//            num[j+i+1]=nums1[i+5];
//            j=i+1;
//        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.printf(num[i]+"");
//        }

        ListNodeBasicUse.Node node=new ListNodeBasicUse.Node(2);
        System.out.println(node);
    }

}
