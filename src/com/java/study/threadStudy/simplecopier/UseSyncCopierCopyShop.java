package com.java.study.threadStudy.simplecopier;

public class UseSyncCopierCopyShop {
    public static void main(String[] args) {
        Copier cannon=new Copier("佳能");
        Employee smith=new Employee("Smith",1,cannon);
        Employee john=new Employee("john",2,cannon);
        smith.start();
        john.start();
    }
}
