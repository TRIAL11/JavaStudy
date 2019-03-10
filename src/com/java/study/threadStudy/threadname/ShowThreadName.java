package com.java.study.threadStudy.threadname;

public class ShowThreadName extends Thread{
    public ShowThreadName(){
        super();
    }
    public ShowThreadName(String name){
        super(name);
    }
    public void run(){
        System.out.println("这个线程的名字是："+this.getName());
    }
}
