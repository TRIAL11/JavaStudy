package com.java.study.threadStudy;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("这是在Main()执行的代码");
    }
}
