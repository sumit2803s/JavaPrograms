//Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
package Strings;

public class reversewords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        char[] arr=s.toCharArray();
        int right;
        int left=0;
        for(right=0;right<arr.length;right++)
        {
            if(arr[right]==arr.length ||arr[right]==' ')
            {
                reverse(arr,left,right-1);
                left=right+1;
            }
        }
        System.out.println(new String(arr));
    }
    public static void reverse(char[] arr,int left,int right)
    {
        while(left<right)
        {
            char temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
    }
}
