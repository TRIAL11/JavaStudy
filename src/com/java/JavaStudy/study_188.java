package com.java.JavaStudy;

class SimpleTestToThis {
    int a;
    void test(){
        int a=55;
        this.a=this.countArea(a);
        System.out.println("正方体的面积：");
        System.out.println(this.a);
    }
    int countArea(int circumference){
        int sideLength=circumference;
        int area=sideLength*sideLength;
        return area;
    }
}
public class study_188{
    public static void main(String[] args) {
        SimpleTestToThis simpleTestToThis=new SimpleTestToThis();
        simpleTestToThis.test();
    }
}
