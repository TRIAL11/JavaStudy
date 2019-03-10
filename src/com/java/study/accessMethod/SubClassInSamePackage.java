package com.java.study.accessMethod;

public class SubClassInSamePackage extends AccessMethods{
    public void usingProtectedMethod(){
        super.protectedMethod();
    }
    public void protectedMethod(){  //覆盖父类的方法
    }
//    public void usingPrivateMethod(){
//        super.privateMethod();   //错误，父类private方法对于子类不可见
//    }
}
