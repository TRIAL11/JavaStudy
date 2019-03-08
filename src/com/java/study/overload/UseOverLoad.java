package com.java.study.overload;

import com.java.study.override.Bus;
import com.java.study.override.CarBase;
import com.java.study.override.ElectronicBus;
import com.java.study.override.SportsCar;

public class UseOverLoad {
    public static void main(String[] args) {
        UserCar userCar=new UserCar();
        CarBase carBase=new CarBase();
        SportsCar sportsCar=new SportsCar();
        Bus bus=new Bus();
        ElectronicBus electronicBus=new ElectronicBus();
        System.out.println("使用CarBase类的对象做参数调用UserCar类的setCar()方法");
        userCar.setCar(carBase);
        System.out.println("使用sportsCar类的对象做参数调用UserCar类的setCar()方法");
        userCar.setCar(sportsCar);
        System.out.println("使用bus类的对象做参数调用UserCar类的setCar()方法");
        userCar.setCar(bus);
        System.out.println("使用electronicBus类的对象做参数调用UserCar类的setCar()方法");
        userCar.setCar(electronicBus);
    }
}
