package Array;

public class MaximumVowels {
    public static void main(String[] args) {
        String s = "abciiidef"; int k=3;
        int count=0,max=0;
        for(int i=0;i<k;i++)
        {
            if(isvowel(s.charAt(i)))
            {
                count++;
            }
        }
        max=Math.max(max,count);
        for(int i=k;i<s.length();i++)
        {
            if(isvowel(s.charAt(i)))
            {
                count++;
            }
            if(isvowel(s.charAt(i-k)))
            {
                count--;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }

    public static boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
