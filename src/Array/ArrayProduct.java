//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
package Array;

public class ArrayProduct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++)
        {
            res[i]=res[i-1]*nums[i-1];
        }
        int rightproduct=1;
        for(int i=n-1;i>=0;i--)
        {
            res[i]*=rightproduct;
            rightproduct*=nums[i];
        }
        for(int i=0;i<n;i++)
            System.out.print(res[i]+" ");
    }
}
