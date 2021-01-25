package com.xc.algorithm.sequence;

import java.util.Iterator;

public class sequenceList<T> implements Iterable<T>{

    //存储元素的数组
    private T[] ele;
    //记录元素个数
    private int N;

    private static final Integer DEFAULT_CAPACITY = 10;

    //初始化
    public sequenceList(int capacity){
        this.ele = (T[]) new Object[capacity];
        this.N = 0;
    }

    public sequenceList(){
        this(DEFAULT_CAPACITY);
    }

    //将线性表值为空表
    public void clear(){
        for (int i = 0; i < N; i++)
            ele[i] = null;
        this.N = 0;
    }

    //判断是否为空表
    public boolean isEmpty(){
        return N == 0;
    }

    //获取长度
    public int length(){
        return N;
    }

    //获取指定位置的元素
    public T get(int index){
        return ele[index];
    }

    public void add(T t){
        ele[N++] = t;
    }
    //指定位置前面添加元素
    public void add(T t,int index){
        for(int i = N;index<i;i--){
            ele[++i] = ele[i];
        }
        ele[--index] = t;
        N++;
    }
    //删除指定元素并返回
    public T remove(int index){
        T t = ele[index];
        ele[index] = null;
        return t;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    class SIterator implements Iterator{

        private int current;

        public SIterator(){
            this.current = 0;
        }

        @Override
        public boolean hasNext() {
            return current < N;
        }

        @Override
        public T next() {
            return ele[current++];
        }
    }
}
