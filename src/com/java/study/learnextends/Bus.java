package com.java.study.learnextends;

public class Bus extends CarBase{
    public int max_Passenger=50;
    public int current_Passenger=0;
    public Bus(){
        super();
        System.out.println("Bus类构造方法被调用");
    }
    public Bus(int speed,String name,String color,int maxspeed,int max_Passenger,int current_Passenger){
        super(speed,name,color,maxspeed);
        this.current_Passenger=current_Passenger;
        this.max_Passenger=max_Passenger;
        System.out.println("Bus类有参数的构造方法被调用了");
    }
    public boolean getOnBus(int p_amout){
        int temp=current_Passenger+p_amout;
        if(temp >max_Passenger){
            return false;
        }else{
            current_Passenger=temp;
            return true;
        }
    }
    public boolean getDownBus(int p_amout){
        int temp=current_Passenger-p_amout;
        if(temp <0){
            return false;
        }else {
            current_Passenger=temp;
            return true;
        }
    }
}
