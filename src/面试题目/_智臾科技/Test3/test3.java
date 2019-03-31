package 面试题目._智臾科技.Test3;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //普通数组中位数算法
        //输入一串数字
        double mid;
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine().toString();
        String arr[]=str.split(" ");
        int number[]=new int[arr.length];
        int length=arr.length;
        for(int i=0;i<arr.length;i++){
            number[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(number);
        if(number.length%2==0){
            mid=(number[length/2]+number[length/2-1])/2;
        }else{
            mid=number[(int)(length/2)];
        }
        System.out.println(mid);
    }
}
