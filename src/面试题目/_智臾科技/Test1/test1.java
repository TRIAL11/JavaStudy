package 面试题目._智臾科技.Test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Algorithm_1 algorithm_1=new Algorithm_1();
        int number=algorithm_1.maxNumber;
        //input数字，测试用
        //假设输入数字为有效数字
        System.out.println("请输入0-255之间的数字若干：");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine().toString();
        String arr[]=str.split(" ");
        int numberArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            numberArr[i]=Integer.parseInt(arr[i]);
        }
        //算法实现
        algorithm_1.test1_algoithm(numberArr);
    }
}
