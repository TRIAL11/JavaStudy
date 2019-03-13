package com.java.studyApply.SimpleSumTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 利用线程的挂起制作一个简易的10以内加减法口算题目
* 10题为一组1
* 每题5s时间*/
public class SimpleSum {
    public static void main(String[] args) throws IOException{
        SimpleClass simpleClass=new SimpleClass();
        int choose=0;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("以下题目为10以内加法和减法题目");
        System.out.println("每一组为10题，每题5s时间考虑");
        System.out.println("选择题型：0结束  1加法题  2减法题");
        choose=Integer.parseInt(bufferedReader.readLine());
        do{
            if(choose==1){
                System.out.println("你选择了加法题型，准备开始");
                simpleClass.countDown();
                simpleClass.addTest();
                System.out.println("选择题型：0结束  1加法题  2减法题");
                choose=Integer.parseInt(bufferedReader.readLine());
            }
            if(choose==2){
                System.out.println("你选择了减法题型，准备开始");
                simpleClass.countDown();
                simpleClass.subTest();
                System.out.println("选择题型：0结束  1加法题  2减法题");
                choose=Integer.parseInt(bufferedReader.readLine());
            }
        }while (choose!=0);
        System.out.println("结束");
    }
}
