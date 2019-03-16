package com.java.study.threadStudy.simplecopier;

public class Copier {
    private String name;
    public Copier(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public synchronized void copyPages(int pages){
        Thread employee=Thread.currentThread();
        System.out.println(employee.getName()+"\t正在使用复印机\t" + name);
        long time=pages*1000;
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            System.out.println("wrong"+e.getMessage());
            return;
        }
        System.out.println(employee.getName()+"\t用完了打印机\t"+name);
    }
}
