package com.java.study.override;

public class SportsCar extends CarBase{
    public int leave_nitrogen= 90;
    public int autoUsingN =5; //每次加速使用的氮气量
    public SportsCar(){
        System.out.println("SportsCar类的无参数构造方法被调用了");
    }
    public SportsCar(int speed,String name,String color,int maxspeed,int leave_nitrogen){
        super(speed,name,color,maxspeed);
        this.leave_nitrogen=leave_nitrogen;
        System.out.println("SportsCar类中有参数的构造方法被调用了");
    }
    public void speedUp(int p_speed){
        System.out.println("SportsCar类中speedUp(int)方法被调用了");
        int tempSpeed=0;
        if(p_speed>0){
            tempSpeed=p_speed+speed;
        }
        if(tempSpeed<=maxspeed){
            speed=tempSpeed;
        }
        if(leave_nitrogen >=autoUsingN){
            leave_nitrogen-=autoUsingN;
        }else {
            leave_nitrogen=0;
        }
    }
    public void speedUpUsingN(int p_amout){
        int realAmout=0;
        if(leave_nitrogen<=p_amout){
            realAmout=leave_nitrogen;
            leave_nitrogen=0;
        }else {
            realAmout=p_amout;
            leave_nitrogen-=p_amout;
        }
        int speedUp=(int) (realAmout * 0.25);
        speed +=speedUp;
    }
    public void addN(int p_amout){
        if(p_amout<0){
            return;
        }else {
            leave_nitrogen+=p_amout;
        }
    }
}
