package com.java.study.override;

public class ParentClass {
    private void privateMethod(){
        System.out.println("这是ParentClass中的privateMethod方法");
    }
    void defaultMethod(){
        System.out.println("这是ParentClass中的defaultMethod方法");
    }
    protected void protectedMethod(){
        System.out.println("这是ParentClass中的protectedMethod方法");
    }
    public void publicMethod(){
        System.out.println("这是ParentClass中的publicMethod方法");
    }
    public void test(){
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
