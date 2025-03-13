//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
package Array;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,0,1,1,0,1};
        int right=0,left=0,zerocount=0,max=0;
        for( right=0;right<arr.length;right++){
            if(arr[right]==0){
                zerocount++;
            }
            while(zerocount>1){
                if(arr[left]==0){
                    zerocount--;
                }
                left++;
            }
            max=Math.max(max,right-left);
        }
        System.out.print(max);
    }
}
