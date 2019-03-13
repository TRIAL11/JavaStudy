package com.java.study.threadStudy.currentThread;

public class PrintCurrentThreadName {
    public void printCurrentThreadName(){
        Thread currentThread=Thread.currentThread();
        String threadName=currentThread.getName();
        System.out.println("执行线程的名叫做"+threadName);
    }
}
