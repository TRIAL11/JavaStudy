package com.java.study.threadStudy.multithreads;

public class RunPrintNumberThread {
    public static void main(String[] args) {
        PrintNumberThread printNumberThread=new PrintNumberThread();
        PrintNumberThread printNumberThread1=new PrintNumberThread();
        printNumberThread.PrintNumberThread(3);
        printNumberThread1.PrintNumberThread(5);
        printNumberThread.setName("Thread1");
        printNumberThread1.setName("Thread2");
        printNumberThread.start();
        printNumberThread1.start();
        System.out.println("主线程结束");
    }
}
