package com.syz.algorithm.dataStructure.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: syz
 * @Date: 2021/8/25 9:43
 * @Description: 打散推荐结果
 * 推给用户每三个视频最多只能有一个图片
 * v0，v1,v2,p3,p4,p5,v6,v7,v8,v9
 * 结果：
 * v0,v1,v2,p3,v6,v7,v8,p4,v9,p5
 */

public class ResultBrokenUp {

    public static void main(String[] args) {
        List<String> result=new ArrayList<>();
        result.add("v_0");
        result.add("v_1");
        result.add("v_2");
        result.add("p_3");
        result.add("p_4");
        result.add("p_5");
        result.add("v_6");
        result.add("p_7");
        result.add("v_8");
        result.add("v_9");
        List<String> rs=new ResultBrokenUp().getList(result,2);
        for (int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i));
        }
    }

    private List<String> getList(List<String> picAndVieo, int maxNUm) {
        List<String> result=new ArrayList<>();
        if (null == picAndVieo || picAndVieo.size()==0) {
            return result;
        }

        Queue<String> videoQueue = new LinkedList<>();
        Queue<String> picQueue = new LinkedList<>();
        Boolean firsetPic=false; //验证是不是图片的
        int index=0;
        int picAndVieoSize=picAndVieo.size();

        //第一个还是video index还是小于picAndVieoSize
        while (!firsetPic && index<picAndVieoSize){
            //还在这个范围之内
            if(isVideo(picAndVieo.get(index))){     //你是视频，result一直加
                result.add(index,picAndVieo.get(index));
                index++;
            }else {
                //如果不是，我就把第一个标识改为true.说明我找到了
                firsetPic=true;
            }
        }

        //下面分他是video还是pic
        while (index<picAndVieoSize){
            //一样验证如果你是video，就添加到对应队列
            if(isVideo(picAndVieo.get(index))){
                videoQueue.add(picAndVieo.get(index));
            }else {
                picQueue.add(picAndVieo.get(index));
            }
            index++;
        }
        //验证当前结果集，可能存在成千上万个video
        int currentSize=result.size();
        while (!videoQueue.isEmpty() &&!picQueue.isEmpty()){
            //开始验证间隔pic量
            if(currentSize>=maxNUm){
                //符合条件就把结果集中加入pic
                result.add(picQueue.poll());
                currentSize=0;//就是允许之间缝隙
            }else {
                //如果你不大于他，我就只能加video
                result.add(videoQueue.poll());
                currentSize++;
            }
        }
        //如果最后我的pic加完了，还剩video数据
        while (!videoQueue.isEmpty()){
            result.add(videoQueue.poll());
        }
        //如果此时video剩余数量刚好等于间隔，此时还是可以在插入一张图片，此时图片队列不为空
        if(currentSize>=maxNUm && !picQueue.isEmpty()){
            result.add(picQueue.poll());
        }
        return result;
    }

    private boolean isVideo(String s) {
        //判断是不是视频
        if(s.indexOf("v")!=-1){
            return true;
        }else {
            return false;
        }
    }
}
