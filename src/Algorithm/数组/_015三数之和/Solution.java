package Algorithm.数组._015三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//        List<Integer> list=new ArrayList<>();
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;++i){
            int l=i+1,r=nums.length-1;
            while (l<r){
                List<Integer> list=new ArrayList<>();
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    if(!lists.contains(list)){
                        lists.add(list);
                    }
                }
                if(sum<=0){
                    ++l;
                }else {
                    --r;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums={-5,0,1,2,3,4,5};
        Solution solution=new Solution();
        List<List<Integer>> list=new ArrayList<>();
        list=solution.threeSum(nums);

    }
}
