//Given a string s, reverse only all the vowels in the string and return it.
package Strings;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            if(!isvowel(arr[i]))
            {
                i++;
            }
            else if(!isvowel(arr[j]))
            {
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(arr));
    }
    public static boolean isvowel(char c){
        boolean flag=false;
        if(c=='a'|| c=='e'|| c=='i' ||c=='o'||c=='u'|| c=='A'|| c=='E'|| c=='I' || c=='O'|| c=='U'){
            flag=true;
        }
        return flag;
    }
}
