//Given a string s, find the length of the longest substring without duplicate characters.
package Strings;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int res=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            boolean[] flag=new boolean[256];
            for(int j=i;j<l;j++)
            {
                if(flag[s.charAt(j)]){
                    break;
                }
                else{
                    res=Math.max(res,j-i+1);
                    flag[s.charAt(j)]=true;
                }
            }
        }
        System.out.println(res);
    }
}
