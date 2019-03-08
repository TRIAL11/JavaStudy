package com.java.study.overload;

import com.java.study.override.CarBase;
import com.java.study.override.ElectronicBus;

public class UserCar {
    public CarBase car;
    public void setCar(CarBase car){
        System.out.println("setCar(CarBase)方法被调用了");
        this.car=car;
    }
    public void setCar(ElectronicBus bus){
        System.out.println("setCar(ElectronicBus)方法被调用了");
        this.car=bus;
    }
}
