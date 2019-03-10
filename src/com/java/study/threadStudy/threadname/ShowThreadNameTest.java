package com.java.study.threadStudy.threadname;

public class ShowThreadNameTest {
    public static void main(String[] args) {
        ShowThreadName defaultName=new ShowThreadName();
        ShowThreadName name=new ShowThreadName("线程的名字");
        //启动线程
        defaultName.start();
        name.start();
    }
}
