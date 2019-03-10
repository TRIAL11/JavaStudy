package com.java.study.override.diffpkg;

import com.java.study.override.ParentClass;

public class SubClassInDiffPkg extends ParentClass{
    private void privateMethod(){
        System.out.println("这是SubClassInDiffPkg中的privateMethod方法");
    }
    void defaultMethod(){
        System.out.println("这是SubClassInDiffPkg中的defaultMethod方法");
    }
    protected void protectedMethod(){
        System.out.println("这是SubClassInDiffPkg中的protectedMethod方法");
    }
    public void publicMethod(){
        System.out.println("这是SubClassInDiffPkg中的publicMethod方法");
    }
}
