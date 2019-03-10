package com.java.study.override;

public class SubClassInSamePkg extends ParentClass{
    private void privateMethod(){
        System.out.println("这是SubClassInSamePkg中的privateMethod方法");
    }
    void defaultMethod(){
        System.out.println("这是SubClassInSamePkg中的defaultMethod方法");
    }
    protected void protectedMethod(){
        System.out.println("这是SubClassInSamePkg中的protectedMethod方法");
    }
    public void publicMethod(){
        System.out.println("这是SubClassInSamePkg中的publicMethod方法");
    }
}
