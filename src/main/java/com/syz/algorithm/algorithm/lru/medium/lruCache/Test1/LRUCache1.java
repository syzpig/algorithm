package com.syz.algorithm.algorithm.lru.medium.lruCache.Test1;

import java.util.LinkedHashMap;
import java.util.Map;

/*
        所以我们用的数据结构就是 LinkedListLinkedList (底层是双向链表)+ HashMapHashMap,也直接用 LinkedHashMapLinkedHashMap 更为方便。看面试官要求是啥了。

        解法一：使用 LinkedHashMapLinkedHashMap
        你当然可以直接重写 removeEldestEntryremoveEldestEntry 方法，这里暂忽略此写法

        最右边的是最新的，存活时间长的
        */

public class LRUCache1 {
    int capacity;
    Map<Integer, Integer> map;

    public LRUCache1(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }


    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        // 先删除旧的位置，再放入新位置
        Integer value = map.remove(key);
        map.put(key, value);
        return value;

    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
            return;
        }
        map.put(key, value);
        // 超出capacity，删除最久没用的,利用迭代器删除第一个
        if (map.size() > capacity) {
            map.remove(map.entrySet().iterator().next().getKey());
        }

    }


}
