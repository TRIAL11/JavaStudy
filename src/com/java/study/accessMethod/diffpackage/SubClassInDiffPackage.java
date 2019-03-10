package com.java.study.accessMethod.diffpackage;

import com.java.study.accessMethod.AccessMethods;

public class SubClassInDiffPackage extends AccessMethods{
    public void usingPublicMethod(){
        super.publicMethod();
    }
    public void publicMethod(){

    }
    public void usingProtectedMethod(){
        super.protectedMethod();
    }
    public void protectedMethod(){

    }
//    public void usingDefaultMethod(){
//        super.defaultMethod();          //错误,父类方法对子类不可见，因为不同包
//    }
}
