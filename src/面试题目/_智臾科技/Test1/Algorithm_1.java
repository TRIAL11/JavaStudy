package 面试题目._智臾科技.Test1;

public class Algorithm_1 {
    int maxNumber=1000000;
    public void test1_algoithm(int[] arr) {
        int[] mapArr=new int[256];
        for(int i=0;i<arr.length;i++){
            mapArr[arr[i]]++;
        }
        for(int i=0;i<mapArr.length;i++){
            while (mapArr[i]!=0){
                System.out.println(i);
                mapArr[i]--;
            }
        }
    }
}
