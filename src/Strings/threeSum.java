package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int left=i+1;
            int right=nums.length-1;

            if(i>0 && nums[i]==nums[i-1])
                continue;

            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0){
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));

                    while(left<nums.length-1 && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(right>0 && nums[right]==nums[right-1]) {
                        right--;
                    }
                    left++;
                    right--;

                }
                else if(nums[right]+nums[left]+nums[i]>0)
                {
                    right--;
                }
                else {
                    left++;

                }

            }
        }
        System.out.print(result);
    }
}
