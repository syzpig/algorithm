package com.syz.algorithm.dataStructure.stack.mystack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> data;

    public MyStack() {
        this.data = new ArrayList<>();
    }

    public void push(Integer x){
        data.add(x);
    }
    public Boolean isEmpty(){
       return data.isEmpty();
    }
    public int top(){
        return data.get(data.size()-1);
    }
    public Boolean pop(){
        if (isEmpty()) {
            return false;
        }
         data.remove(data.size()-1);
        return true;
    }
}
