package com.java.study.threadStudy.currentThread;

public class CurrentThreadNameII {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                PrintCurrentThreadName printer=new PrintCurrentThreadName();
                printer.printCurrentThreadName();
            }
        };
        Thread thread=new Thread(runnable,"线程-1");
        thread.start();
        PrintCurrentThreadName printCurrentThreadName=new PrintCurrentThreadName();
        printCurrentThreadName.printCurrentThreadName();
    }
}
