package com.java.JavaStudy;

/*当方法遇到static关键字
  * base为类变量
  * value为普通变量
  * commMethod为普通方法
  * StaticMethod1和StaticMethod2为类方法*/
class StaticMethods{
    static int base=6;
    int value=7;
    static void StaticMethod1(int a){
//        commMethod(value);
//        无法调用非static方法或使用非static变量
        StaticMethods staticMethods=new StaticMethods();
        staticMethods.commMethod(a);
        StaticMethods.StaticMethod2(a+StaticMethods.base);
        StaticMethod2(a+base);
        System.out.println("类方法StaticMethod1被调用了，参数为：" + a);
    }
    void commMethod(int a){
        System.out.println("commMethod可以使用类变量" + StaticMethods.base);
        StaticMethod2(value);
        System.out.println("方法commMethod被调用，参数为：" + a);
    }
    static void StaticMethod2(int a){
        System.out.println("类方法StaticMethod2被调用，参数为：" + a);
    }
}
public class study_244 {
    public static void main(String[] args) {
        StaticMethods.StaticMethod1(9);
    }
}
