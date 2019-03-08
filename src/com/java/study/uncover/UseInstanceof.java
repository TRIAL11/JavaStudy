package com.java.study.uncover;

import com.java.study.override.Bus;
import com.java.study.override.CarBase;
import com.java.study.override.ElectronicBus;
import com.java.study.override.SportsCar;

public class UseInstanceof {
    public static void main(String[] args) {
        ElectronicBus electronicBus=new ElectronicBus();
        CarBase carBase=electronicBus;
        if(carBase instanceof Object){
            System.out.println("carBase指向一个Object类");
        }else{
            System.out.println("carBase指向一个非Object类");
        }
        if(carBase instanceof CarBase){
            System.out.println("carBase指向CarBase类");
        }else{
            System.out.println("carBase指向非CarBase类");
        }
        if(carBase instanceof Bus){
            System.out.println("carBase指向Bus");
        }else{
            System.out.println("carBase指向非Bus");
        }
        if(carBase instanceof ElectronicBus){
            System.out.println("carBase指向ElectronicBus");
        }else {
            System.out.println("carBase指向非ElectronicBus");
        }
        if(carBase instanceof SportsCar){
            System.out.println("carBase指向SportsCar");
        }else{
            System.out.println("carBase指向非SportsCar");
        }
    }
}
