package com.java.study.polymorphism;

import com.java.study.override.Bus;
import com.java.study.override.CarBase;
import com.java.study.override.ElectronicBus;
import com.java.study.override.SportsCar;

public class UseCarGroup {
    public static void main(String[] args) {
        System.out.println("====Test Begin====");
        CarBase leading=new SportsCar();
        CarBase[] followingCars=new CarBase[]{new CarBase(),new SportsCar(),new Bus(),new ElectronicBus()};
        CarGroup carGroup=new CarGroup(leading,followingCars);
        carGroup.speedUp(50);
        carGroup.slowDown(10);
        System.out.println("====Test Over====");
    }
}
