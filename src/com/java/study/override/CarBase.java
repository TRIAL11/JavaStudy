package com.java.study.override;

public class CarBase {
    public int speed;
    public String name;
    public String color;
    public int maxspeed=90;
    public CarBase(){
        System.out.println("CarBase类构造方法被调用");
    }
    public CarBase(int speed,String name,String color,int maxspeed){
        this.speed=speed;
        this.name=name;
        this.color=color;
        this.maxspeed=maxspeed;
        System.out.println("CarBase类有参数的构造方法被调用了");
    }
    public void speedUp(int p_speed){
        System.out.println("CarBase类中speedUp(int)方法被调用了");
        int tempSpeed=0;
        if(p_speed > 0){
            tempSpeed=p_speed+speed;
        }
        if(tempSpeed <= maxspeed){
            speed=tempSpeed;
        }
    }
    public void slowDown(int p_speed){
        System.out.println("CarBase类中speedDown(int)方法被调用了");
        if(p_speed > 0){
            int tempSpeed=speed-p_speed;
            if(tempSpeed>=0){
                speed=tempSpeed;
            }
        }
    }
    public void followSpeed(CarBase carBase){
        int newSpeed=carBase.speed;
        if(newSpeed > speed){
            speedUp(newSpeed-this.speed);
        }else {
            slowDown(this.speed-newSpeed);
        }
    }
}
