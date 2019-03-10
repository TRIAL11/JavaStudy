package com.java.study.accessMethod.diffpackage;

import com.java.study.accessMethod.AccessMethods;

public class DiffPackage {
    public void usingPublicMethod(){
        AccessMethods accessMethods=new AccessMethods();
        accessMethods.publicMethod();
//        accessMethods.defaultMethod();  //错误
    }
}
