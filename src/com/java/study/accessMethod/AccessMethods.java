package com.java.study.accessMethod;

/*
* 方法修饰符
* public无限制的修饰符
* protected仅对子类和同类的包可见
* void默认控制符仅在本包中可见
* private仅对本类可见
* 可见性大小public > protected > void > private*/
public class AccessMethods {
    public void publicMethod(){
        System.out.println("public方法");
    }
    void defaultMethod(){
        System.out.println("void方法");
    }
    protected void protectedMethod(){
        System.out.println("protected方法");
    }
    private void privateMethod(){
        System.out.println("private方法");
    }
    public void usingMethods(){
        this.publicMethod();
        this.protectedMethod();
        this.defaultMethod();
        this.privateMethod();
    }
}
