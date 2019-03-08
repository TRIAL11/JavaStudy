package com.java.study.accessMethod;

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
    }
}
