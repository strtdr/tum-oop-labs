package com.company;

import java.util.ArrayList;

public class Queue {
    int maxSize;
    boolean parameter;
    ArrayList<Integer> list = new ArrayList<>();
    Queue(){
        parameter = false;
        System.out.println("not full");
    }

    Queue(int maxSize){
        this.maxSize = maxSize;
        parameter = true;
    }

    public void push(int value){

        list.add(value);

        if(parameter){
            if(list.size() < maxSize){
                list.add(value);
            }
        }
        else list.add(value);
    }

    public  int pop(){
        int a = list.get(0);
        list.remove(0);
        return  a;
    }


}