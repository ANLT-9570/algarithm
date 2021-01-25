package com.xc.algorithm.liner;

public class LinkList<T> {

    //记录头结点
    private Node head;
    //记录链表的长度
    private int N;

    //节点类
    private class Node{
        //存储数据
        T item;
        //下一个节点
        Node next;
        public Node(T item,Node next){
            this.item = item;
            this.next = next;
        }
    }

    public LinkList(){
        //头结点初始化
        this.head = new Node(null,null);
        //初始化元素个数
        this.N = 0;
    }

    //清空链表
    public void clear(){
        head.next = null;
        this.N = 0;
    }

    public int length(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    //获取指定位置的元素
    public T get(int i){
        //从头结点开始
        Node n = head.next;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        return n.item;
    }

    public void add(T t){
        Node n = head.next;
        while (n != null && n.next != null){
            n = n.next;
        }
        n.next = new Node(t,null);
        this.N++;
    }

    //指定位置添加元素
    public void add(T t,int i){
        Node n = head.next;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        Node temp= n.next;
        n.next = new Node(t,temp);
        this.N++;
    }

    public void remove(int i){
        Node pre = head.next;
        //获取要删除数据的前一个节点
        for (int j = 0; j < i; j++) {
            pre = pre.next;
        }
        //获取要删除的节点数据
        Node delNode = pre.next.next;
        //把它的下一个节点数据指向前前一个节点数据
        pre.next = delNode.next;
        this.N--;
    }
}
