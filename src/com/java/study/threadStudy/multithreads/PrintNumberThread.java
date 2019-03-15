package com.java.study.threadStudy.multithreads;

public class PrintNumberThread extends Thread{
    private int times;
    public void PrintNumberThread(int times){
        this.times=times;
    }
    public void run(){
        for(int i=0;i<times;i++){
            String content=this.getName()+"\t:\t"+i;
            try {
                this.sleep(1);
            }catch (InterruptedException e){
                System.out.println("sorry"+e.getMessage());
                return;
            }
            System.out.println(content);
        }
        System.out.println("线程\""+this.getName()+"\"结束了.");
    }
}
