package com.java.study.threadStudy.threadsleep;

public class TestAddingInMain {
    public static void main(String[] args) {
        int flag=3;
        do {
            int a =(int) (100 * Math.random());
            int b =(int) (100 * Math.random());
            System.out.println("请在5s内计算出结果："+ a +" + "+b );
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println("sorry,程序运行出错："+e.getMessage());
                return;
            }
            int result=a+b;
            System.out.println("正确结果为："+ result);
            flag--;
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("sorry,程序运行出错: " + e.getMessage());
                return;
            }
        }while (flag>0);
    }
}
