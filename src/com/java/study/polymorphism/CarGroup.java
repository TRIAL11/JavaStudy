package com.java.study.polymorphism;

import com.java.study.override.CarBase;

public class CarGroup {
    public CarBase leadingCar;
    public CarBase[] followingCars;
    public CarGroup(CarBase leadingCar,CarBase[] followingCars){
        this.leadingCar=leadingCar;
        this.followingCars=followingCars;
    }
    public void speedUp(int p_speed){
        leadingCar.speedUp(p_speed);
        for(int i=0;i<followingCars.length;i++){
            followingCars[i].followSpeed(leadingCar);
        }
    }
    public void slowDown(int p_speed){
        leadingCar.slowDown(p_speed);
        for(int i=0;i<followingCars.length;i++){
            followingCars[i].followSpeed(leadingCar);
        }
    }
}
