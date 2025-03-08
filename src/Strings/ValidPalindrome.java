package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        String lps="";
        for(int i=1;i<s.length();i++)
        {
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
                if(low==-1 || high==s.length() )
                    break;
            }
            String palindrome=s.substring(low+1,high);
            if(palindrome.length()>lps.length())
            {
                lps=palindrome;
            }
            low=i-1;
            high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
                if(low==-1 || high==s.length() )
                    break;
            }
            palindrome=s.substring(low+1,high);
            if(palindrome.length()>lps.length())
            {
                lps=palindrome;
            }
        }
        System.out.println(lps);
    }
}
