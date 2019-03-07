package com.java.study.override;

public class Bus extends CarBase{
    public int max_Passenger=35;
    public int current_Passenger=0;
    public int max_slow=27;
    public Bus(){
        System.out.println("Bus类无参数构造方法被调用了");
    }
    public Bus(int speed,String name,String color,int maxspeed,int current_Passenger,int max_Passenger){
        super(speed,name,color,maxspeed);
        this.max_Passenger=max_Passenger;
        this.current_Passenger=current_Passenger;
        System.out.println("Bus类有参数的构造方法被调用了");
    }
    public void slowDown(int p_speed){
        System.out.println("Bus类中slowDown(int)方法被调用了");
        if(p_speed >max_slow){
            p_speed=max_slow;
        }
        if(p_speed >0){
            int tempSpeed=speed-p_speed;
            if(tempSpeed >=0){
                speed=tempSpeed;
            }
        }
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
