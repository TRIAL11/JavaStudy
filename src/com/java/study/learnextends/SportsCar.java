package com.java.study.learnextends;

public class SportsCar extends CarBase{
    public int leave_nitrogen =90;
    public SportsCar(){
        System.out.println("SportsCar类构造方法被调用");
    }
    public SportsCar(int speed,String name,String color,int maxspeed,int leave_nitrogen){
        super(speed,name,color,maxspeed);
        this.leave_nitrogen=leave_nitrogen;
        System.out.println("SportsCar类有参数的构造方法被调用了");
    }
    public void speedUpUsingN(int p_amout){
        int realAmout=0;  //真正用于加速的氮气量
        if(leave_nitrogen <=p_amout){
            realAmout=leave_nitrogen;
            leave_nitrogen=0;
        }else{
            realAmout=p_amout;
            leave_nitrogen-=p_amout;
        }
        int speedUp=(int)(realAmout*0.25);  //0.25为氮气量与速度的转换关系，可自定义
        speed+=speedUp;
    }
    public void addN(int p_amout){
        if(p_amout<0){
            return;
        }else {
            leave_nitrogen+=p_amout;
        }
    }
}
