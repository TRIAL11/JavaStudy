package com.java.JavaStudy;

public class study_222 {
    public static void main(String[] args) {
        int[] arr={7,8,9};
        int[] clonedArr=(int[]) arr.clone();
        arr[2]=777;
        clonedArr[2]=888;
        System.out.println("arr[1]= "+ arr[1]);
        System.out.println("arr[2]= " + arr[2]);
        System.out.println("clonedArr[1]= "+ clonedArr[1]);
        System.out.println("clonedArr[2]= "+ clonedArr[2]);
    }
}
