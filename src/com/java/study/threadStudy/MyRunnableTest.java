package com.java.study.threadStudy;

public class MyRunnableTest {
    public static void main(String[] args) {
//        MyRunnable myRunnable=new MyRunnable();
//        Thread thread=new Thread(myRunnable);
//        thread.start();
        Thread thread=new Thread(new MyRunnable(){
            public void run(){                       //实现抽象方法
                System.out.println("这是另一段代码"); //执行
            }
        });
        thread.start();
    }
}
