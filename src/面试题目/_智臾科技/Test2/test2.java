package 面试题目._智臾科技.Test2;

import java.util.Scanner;

//利用天数当做整数进行计算
public class test2 {
    public static void main(String[] args) {
        //假设输入日期符合格式要求
        System.out.println("输入时间");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine().toString();
        String arr[]=str.split(".");
        int date_time[]=new int[3];
        for(int i=0;i<3;i++){
            date_time[i]=Integer.parseInt(arr[i]);
        }
        //算法
        Algorithm_2 algorithm_2=new Algorithm_2();
        int apartDays=algorithm_2.addDayToSat(date_time[0],date_time[1],date_time[2]);
        if(algorithm_2.bOrs(date_time[0])){
            System.out.println(apartDays);
        }else{
            System.out.println("-"+apartDays);
        }
    }
}
