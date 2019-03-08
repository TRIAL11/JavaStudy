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
}
