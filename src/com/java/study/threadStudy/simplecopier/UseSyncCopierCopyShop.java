package com.java.study.threadStudy.simplecopier;

/*
* 多个员工使用同一台复印机*/
public class UseSyncCopierCopyShop {
    public static void main(String[] args) {
        Copier cannon=new Copier("佳能");
        Employee smith=new Employee("Smith",1,cannon);
        Employee John=new Employee("John",2,cannon);
        smith.start();
        John.start();
    }
}
