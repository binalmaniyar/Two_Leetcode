package leetcode;

import java.util.*;

public class Word_Pattern {
    
    public static void main(String [] args)     
    {
       Scanner s = new Scanner(System.in);
       String pattern,text;
       
       System.out.print("Enter pattern : ");
       pattern = s.nextLine();
       System.out.print("Enter text : ");
       text = s.nextLine();
       
       System.out.println(wordPattern(pattern,text));
    }
    
    public static boolean wordPattern(String pattern,String text)
    {
        String[] arr = text.split(" ");
        if(arr.length != pattern.length())
            return false;
        
        HashMap<Character,String> map = new HashMap<Character,String>();
        
        for(int i=0; i<pattern.length(); i++)
        {
            char c = pattern.charAt(i);
            
            if(map.containsKey(c))
            {
                String value = map.get(c);
                if(!value.equals(arr[i]))
                {
                    return false;
                }
            }
            else if(map.containsValue(arr[i]))
            {
                return false;
            }
            map.put(c, arr[i]);
        }
        return true;
    }
}
