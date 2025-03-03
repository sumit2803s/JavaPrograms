package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class UncommonWords {
    public static void main(String[] args) {
        String s1="this apple is sweet";
        String s2= "this apple is sour";
        String str1[]=s1.split(" ");
        String str2[]=s2.split(" ");

        HashMap<String,Integer> wordcount=new HashMap<>();
        for(String str:str1)
        {
            wordcount.put(str,wordcount.getOrDefault(str,0)+1);
        }
        for(String str:str2)
        {
            wordcount.put(str,wordcount.getOrDefault(str,0)+1);
        }
        ArrayList<String>list=new ArrayList<>();
        for(String str:wordcount.keySet())
        {
            if(wordcount.get(str)==1)
            {
                list.add(str);
            }
        }
        String res[]=list.toArray(new String[list.size()]);

        for(String str:res)
            System.out.print(str+" ");
    }

}
