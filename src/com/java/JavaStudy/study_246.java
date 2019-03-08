package com.java.JavaStudy;

class Test{
    String str;
    Test(){};
    void noUseElse(String str){
        this.str="A" +str;
    }
}
public class study_246 {
    public static void main(String[] args) {
        String str="OOPS";
        noUse(str);
        System.out.println(str); //输出为OOPS
        Test test=new Test();
        test.noUseElse(str);
        System.out.println(str); //OOPS
        String newStr=noUse1(str);
        System.out.println(newStr); //输出OOOPS
    }
    static void noUse(String str){
        str = "O"+str;
    }
    static String noUse1(String str){
        String newStr="";
        newStr="O"+str;
        return newStr;
    }
}
