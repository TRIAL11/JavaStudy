package com.java.study.override;

import com.java.study.override.diffpkg.SubClassInDiffPkg;

public class QualityTest {
    public static void main(String[] args) {
        System.out.println("====使用ParentClass类调用test()方法====");
        ParentClass parentClass=new ParentClass();
        parentClass.test();
        System.out.println("====使用SubClassInSamePkg类调用test()方法====");
        SubClassInSamePkg subClassInSamePkg=new SubClassInSamePkg();
        subClassInSamePkg.test();
        System.out.println("====使用SubClassInDiffPkg类调用test()方法====");
        SubClassInDiffPkg subClassInDiffPkg=new SubClassInDiffPkg();
        subClassInDiffPkg.test();
    }
}
