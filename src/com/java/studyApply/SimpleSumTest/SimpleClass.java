package com.java.studyApply.SimpleSumTest;

public class SimpleClass {

    public int numbers=10;
    public int sleepTime=5000;  //sleepTime为挂起时间，可修改
    public int diffTime=2000;  //diffTime为两道题目的间隔时间
    public int countTime=4;

    public void addTest(){
        for(int i=0;i<numbers;i++){
            int leftNumber=(int)(10 * Math.random());
            int rightNumber=(int)(10 * Math.random());
            System.out.println(leftNumber + " + "+ rightNumber+"=");
            try{
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println("sorry,程序出现错误");
                return;
            }
            int result=leftNumber+rightNumber;
            System.out.println("正确结果为："+ result);
            try{
                Thread.sleep(diffTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public void subTest(){
        for(int i=0;i<numbers;i++){
            int numberA=(int)(10 * Math.random());
            int numberB=(int)(10 * Math.random());
            int leftNumber=Math.max(numberA,numberB);
            int rightNumber=Math.min(numberA,numberB);
            System.out.println(leftNumber + " + "+ rightNumber+"=");
            try{
                Thread.sleep(sleepTime);
            }catch (InterruptedException e){
                System.out.println("sorry,程序出现错误");
                return;
            }
            int result=leftNumber-rightNumber;
            System.out.println("正确结果为："+ result);
            try{
                Thread.sleep(diffTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void countDown(){
        int countDowmTime=countTime;
        while (countDowmTime>=0){
            countDowmTime--;
            if(countDowmTime==0){
                System.out.println("开始！");
                break;
            }else{
                System.out.print(countDowmTime+" ");
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("wrong,"+e.getMessage());
                return;
            }
        }
    }

}
