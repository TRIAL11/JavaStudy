package com.java.study.threadStudy.simplecopier;

public class SimpleCopyShop {
    public static void main(String[] args) {
        Copier canon=new Copier("佳能");
        Copier sharp=new Copier("夏普");
        Employee simth=new Employee("Smith",2,canon);
        Employee john=new Employee("john",3,sharp);
        simth.start();
        john.start();
    }
}
