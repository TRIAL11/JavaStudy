package com.java.JavaStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class study103 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int serveTimes=0;
        int totalCost=0;
        int hasMoreGoods=0;
        System.out.println("需要接待的客户次数：");
        serveTimes=Integer.parseInt(reader.readLine());
        for(int i=0;i<serveTimes;i++){
            totalCost=0;
            do {
                System.out.println("输入商品的单价：");
                int price=Integer.parseInt(reader.readLine());
                if(price<0){
                    System.out.println("商品单价小于0出错");
                    hasMoreGoods=1;
                    continue;
                }
                System.out.println("输入商品的数量：");
                int amount=Integer.parseInt(reader.readLine());
                if(amount<0){
                    System.out.println("商品数量不能小于0");
                    hasMoreGoods=1;
                    continue;
                }
                totalCost=totalCost+price*amount;
                System.out.println("当前总价格为：" +totalCost);
                System.out.println("是否还有商品需要结算？1为有，0无");
                hasMoreGoods=Integer.parseInt(reader.readLine());
            }while (hasMoreGoods==1);
            System.out.println("本次消费金额为： "+totalCost);
            System.out.println("====谢谢光临，欢迎下次再来！====");
        }
        System.out.println(serveTimes+ "次结算结束");
    }
}
