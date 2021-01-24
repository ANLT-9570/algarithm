package com.xc.algorithm.sequence;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

    }
    public void test01(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.clear();
        arrayList.isEmpty();
    }
    public void test02(){
        sequenceList<String> list = new sequenceList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        for(String s:list){

        }
    }
}
