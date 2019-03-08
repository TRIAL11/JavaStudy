package com.java.JavaStudy;

public class study106_2 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                if(j==9){
                    System.out.println(i*j);
                }else{
                    System.out.print(i*j+"\t");
                }
            }
        }
    }
}
