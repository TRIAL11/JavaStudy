package com.java.study.accessMethod;

public class SamePackage {
    public void usingPublicMethod(){
        AccessMethods accessMethods=new AccessMethods();
        accessMethods.publicMethod();
        accessMethods.protectedMethod();
        accessMethods.defaultMethod();
    }
}
