package com.syz.algorithm.algorithm.array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Test3 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,5,11};
        int target = 10;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.printf(i +"===="+j);
                    return;
                }
            }

        }
        //方法二
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                System.out.printf(map.get(nums[i])+""+ i);
            }
            map.put(target - nums[i], i);
        }
    }



}
