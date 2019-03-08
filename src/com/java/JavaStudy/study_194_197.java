package com.java.JavaStudy;

class Car{
    int speed;
    String color;
    String name;
    String direction;
    boolean isTrafficAdmin;
    Car(){
//        this.color="咖啡";
//        this.name="Java护航者";
//        this.isTrafficAdmin=false;
        this("Java护航者","咖啡",false);
    }
    Car(String p_name,String p_color){
        this(p_name,p_color,false);
    }
    Car(String p_name,String p_color,boolean p_trafficAdmin){
        this.name=p_name;
        this.color=p_color;
        this.isTrafficAdmin=p_trafficAdmin;
    }
    //启动汽车
    void driverCar(){
        speed=50;
        direction="南方";
    }
    //汽车加速
    void raiseSpeed(int p_speed){
        if(p_speed < 0){
            System.out.println("方法结束");
            return;
        }
        int currentSpeed=speed+p_speed;
        speed=currentSpeed;
    }
    //重载raiseSpeed
    void raiseSpeed(byte p_speed){
        if(p_speed < 0){
            System.out.println("方法结束");
            return;
        }
        int currentSpeed=speed+p_speed;
        speed=currentSpeed;
    }
    //设置汽车的速度和方向
    void setSpeedAndDirection(int p_speed,String p_direction){
        speed = p_speed;
        direction = p_direction;
    }
    //判断超速
    boolean isOverSpeed(){
        if(speed > 80){
            return true;
        }else{
            return false;
        }
    }
    //超车
    void overtakeCar(Car anotherCar){
        speed=anotherCar.speed+5;
        direction=anotherCar.direction;
    }
    //设置另一辆车的名字，并设置newName
    void setNameForAnotherCar(Car anotherCar,String newName){
        if(!isTrafficAdmin){
            System.out.println("无法调用方法");
            return;
        }
        anotherCar.name=newName;
    }
    //设置另一辆车的速度为0即停车
    void setSpeedForAnotherCar(Car anotherCar,int newSpeed){
        if(!isTrafficAdmin){
            System.out.println("无法被调用");
            return;
        }
        anotherCar.speed=0;
    }
    //得到另一辆车的运行状态

    //修改速度为非负
    void setSpeed(int p_speed){
        if(p_speed<0){
            System.out.println("wrong");
            return;
        }else{
            this.speed=p_speed;
        }
    }
    //打印汽车状态
    void printCarMessage(){
        System.out.println("车名： " + this.name);
        System.out.println("车速度： " + this.speed);
        System.out.println("方向： " + this.direction);
    }
}
public class study_194_197 {
    public static void main(String[] args) {
        Car normalCar=new Car("普通车","白色");
        normalCar.setSpeedAndDirection(55,"东方");
        normalCar.printCarMessage();
    }
}
