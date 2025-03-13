//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
package Array;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6};
        int n = 3;
        int p1=m-1;
        int p2=m-1;
        int pmerge=m+n-1;

        while(p2>=0)
        {
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[pmerge--]=nums1[p1--];
            }
            else{
                nums1[pmerge--]=nums2[p2--];
            }
        }
        for(int i=0;i<nums1.length;i++)
        {
            System.out.print(nums1[i]+" ");
        }
    }
}
