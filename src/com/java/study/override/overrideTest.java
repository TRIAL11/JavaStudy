package com.java.study.override;

public class overrideTest {
    public static void main(String[] args) {
        System.out.println("====Test1开始====");
        SportsCar sportsCar=new SportsCar();
        Bus bus=new Bus();
        sportsCar.speedUp(90);
        System.out.println("sportsCar的速度为 ： "+ sportsCar.speed);
        bus.followSpeed(sportsCar);
        System.out.println("bus的速度为 ： "+ bus.speed);
        System.out.println("====Test1结束====");
        System.out.println("====Test2开始====");
        SportsCar sportsCar1=new SportsCar();
        Bus bus1=new Bus();
        bus1.speedUp(90);
        System.out.println("bus1的速度为 ： " +bus1.speed);
        System.out.println("sportsCar1开始followUp参数bus1");
        sportsCar1.followSpeed(bus1);  //注意
        System.out.println("followUp结束");
        System.out.println("sportsCar1的速度为 ： "+sportsCar1.speed);
    }
}
